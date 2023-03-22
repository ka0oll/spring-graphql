package com.example.graphql.controller

import com.example.graphql.domain.*
import com.example.graphql.query.FetchType
import com.example.graphql.query.ShopDao
import graphql.GraphQLContext
import graphql.language.Field
import graphql.schema.DataFetchingEnvironment
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.BatchMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller


@Controller
class ShopController(
    private val billingRepository: BillingRepository,
    private val shopDao: ShopDao
) {
    @QueryMapping
    fun shops(graphQLContext: GraphQLContext, dataFetchingEnvironment: DataFetchingEnvironment): List<Shop> {
        val fetchTypes = getFetch(dataFetchingEnvironment)
        return shopDao.selectAll(fetchTypes)
    }

    @QueryMapping
    fun shop(@Argument id:Long, graphQLContext: GraphQLContext, dataFetchingEnvironment: DataFetchingEnvironment): Shop {
        val fetchTypes = getFetch(dataFetchingEnvironment)
        return shopDao.selectOne(id, fetchTypes)
    }

    //연관 관계 없는경우 n+1해결 샘플, java list만 콜백이 호출되어진다... shops->owner
    @BatchMapping
    fun billings(shops: java.util.List<Shop>): Map<Shop, List<Billing>>{
        val billings: Map<Long, List<Billing>> = billingRepository.findByShopIdIn(shopIds = shops.map { it.id!! })
            .groupBy{it.shopId }
        return shops.associateWith { billings[it.id] ?: emptyList() }
    }
    //연관 관계 없는경우 n+1해결 샘플, 2뎁스 shops->products->owner
    @BatchMapping
    fun productOwner(products: java.util.List<Product>): Map<Product, Owner>{
        return products.associateWith { Owner("this owner") }
    }


    private fun getFetch(dataFetchingEnvironment: DataFetchingEnvironment): MutableSet<FetchType> {
        val field = dataFetchingEnvironment.field
        val fetchTypes = mutableSetOf<FetchType>()
        field.selectionSet.selections.stream()
            .map { it as Field }
            .map { it.name }
            .forEach {
                if (it == "products") {
                    fetchTypes.add(FetchType.PRODUCTS)
                } else if (it == "owner") {
                    fetchTypes.add(FetchType.OWNER)
                }
            }
        return fetchTypes
    }
}
