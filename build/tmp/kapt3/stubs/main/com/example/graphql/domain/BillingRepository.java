package com.example.graphql.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/graphql/domain/BillingRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lcom/example/graphql/domain/Billing;", "", "findByShopIdIn", "", "shopIds", "graphql"})
public abstract interface BillingRepository extends org.springframework.data.jpa.repository.JpaRepository<com.example.graphql.domain.Billing, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.example.graphql.domain.Billing> findByShopIdIn(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Long> shopIds);
}