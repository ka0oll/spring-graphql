package com.example.graphql.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0017J\"\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\rH\u0017J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/graphql/controller/ShopController;", "", "billingRepository", "Lcom/example/graphql/domain/BillingRepository;", "shopDao", "Lcom/example/graphql/query/ShopDao;", "(Lcom/example/graphql/domain/BillingRepository;Lcom/example/graphql/query/ShopDao;)V", "billings", "", "Lcom/example/graphql/domain/Shop;", "", "Lcom/example/graphql/domain/Billing;", "shops", "Ljava/util/List;", "productOwner", "Lcom/example/graphql/domain/Product;", "Lcom/example/graphql/domain/Owner;", "products", "graphQLContext", "Lgraphql/GraphQLContext;", "dataFetchingEnvironment", "Lgraphql/schema/DataFetchingEnvironment;", "graphql"})
@org.springframework.stereotype.Controller
public class ShopController {
    private final com.example.graphql.domain.BillingRepository billingRepository = null;
    private final com.example.graphql.query.ShopDao shopDao = null;
    
    public ShopController(@org.jetbrains.annotations.NotNull
    com.example.graphql.domain.BillingRepository billingRepository, @org.jetbrains.annotations.NotNull
    com.example.graphql.query.ShopDao shopDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.graphql.data.method.annotation.QueryMapping
    public java.util.List<com.example.graphql.domain.Shop> shops(@org.jetbrains.annotations.NotNull
    graphql.GraphQLContext graphQLContext, @org.jetbrains.annotations.NotNull
    graphql.schema.DataFetchingEnvironment dataFetchingEnvironment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.graphql.data.method.annotation.BatchMapping
    public java.util.Map<com.example.graphql.domain.Shop, java.util.List<com.example.graphql.domain.Billing>> billings(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.graphql.domain.Shop> shops) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.graphql.data.method.annotation.BatchMapping
    public java.util.Map<com.example.graphql.domain.Product, com.example.graphql.domain.Owner> productOwner(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.graphql.domain.Product> products) {
        return null;
    }
}