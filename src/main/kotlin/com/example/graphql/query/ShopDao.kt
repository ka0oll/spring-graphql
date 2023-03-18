package com.example.graphql.query

import com.example.graphql.domain.*
import com.querydsl.jpa.JPQLQuery
import com.querydsl.jpa.impl.JPAQuery
import jakarta.persistence.EntityManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Transactional(readOnly = true)
@Repository
class ShopDao : QuerydslRepositorySupport(Shop::class.java){

    @Autowired
    override fun setEntityManager(entityManager: EntityManager) {
        super.setEntityManager(entityManager)
    }

    fun selectAll(fetchType: Set<FetchType>) : List<Shop>{
        val query = from(QShop.shop).select(QShop.shop).apply {
            if(fetchType.contains(FetchType.PRODUCTS)){
                leftJoin(QShop.shop.products, QProduct.product).fetchJoin()
            }

            if(fetchType.contains(FetchType.OWNER)){
               leftJoin(QShop.shop.owner, QOwner.owner).fetchJoin()
            }
        }

        val shops = query.fetch()

        return shops
    }


}