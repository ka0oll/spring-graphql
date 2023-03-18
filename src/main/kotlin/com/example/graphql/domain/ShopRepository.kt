package com.example.graphql.domain

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.graphql.data.GraphQlRepository

///@GraphQlRepository
interface ShopRepository : JpaRepository<Shop, Long>, QuerydslPredicateExecutor<Shop> {
}