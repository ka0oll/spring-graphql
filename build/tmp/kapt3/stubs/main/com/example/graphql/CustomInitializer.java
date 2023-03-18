package com.example.graphql;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/graphql/CustomInitializer;", "Lorg/springframework/boot/ApplicationRunner;", "repository", "Lcom/example/graphql/domain/ShopRepository;", "billingRepository", "Lcom/example/graphql/domain/BillingRepository;", "(Lcom/example/graphql/domain/ShopRepository;Lcom/example/graphql/domain/BillingRepository;)V", "run", "", "args", "Lorg/springframework/boot/ApplicationArguments;", "graphql"})
@org.springframework.stereotype.Component
public class CustomInitializer implements org.springframework.boot.ApplicationRunner {
    private final com.example.graphql.domain.ShopRepository repository = null;
    private final com.example.graphql.domain.BillingRepository billingRepository = null;
    
    public CustomInitializer(@org.jetbrains.annotations.NotNull
    com.example.graphql.domain.ShopRepository repository, @org.jetbrains.annotations.NotNull
    com.example.graphql.domain.BillingRepository billingRepository) {
        super();
    }
    
    @java.lang.Override
    public void run(@org.jetbrains.annotations.NotNull
    org.springframework.boot.ApplicationArguments args) {
    }
}