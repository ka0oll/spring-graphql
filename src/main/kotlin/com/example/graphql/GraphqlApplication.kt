package com.example.graphql

import com.example.graphql.domain.*
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component
import java.util.*


@SpringBootApplication
class GraphqlApplication

fun main(args: Array<String>) {
    runApplication<GraphqlApplication>(*args)
}


@Component
class CustomInitializer(
    private val repository: ShopRepository,
    private val  billingRepository: BillingRepository
) : ApplicationRunner {

    override fun run(args: ApplicationArguments) {
        (1..5).forEach { _ ->
            val shop = Shop(
                name = UUID.randomUUID().toString(),
                owner = Owner(name = "shop owner")
            ).let {
                repository.save(it)

            }

            shop.addProduct(
                Product(UUID.randomUUID().toString(), "this is description"),
            )
            shop.addProduct(
                Product(UUID.randomUUID().toString(), "this is description"),
            )

            repository.save(shop)

            billingRepository.save(Billing(shopId = shop.id!!))
            billingRepository.save(Billing(shopId = shop.id!!))
        }
    }

}