package com.example.graphql.domain

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.graphql.data.GraphQlRepository

interface BillingRepository : JpaRepository<Billing, Long> {
    fun findByShopIdIn(shopIds:List<Long>):List<Billing>
}