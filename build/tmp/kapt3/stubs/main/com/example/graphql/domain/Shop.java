package com.example.graphql.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0016X\u0097\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0004\u001a\u00020\u00058\u0012X\u0093\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0012X\u0093\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/graphql/domain/Shop;", "", "name", "", "owner", "Lcom/example/graphql/domain/Owner;", "(Ljava/lang/String;Lcom/example/graphql/domain/Owner;)V", "createdAt", "Ljava/time/LocalDateTime;", "getCreatedAt", "()Ljava/time/LocalDateTime;", "id", "", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "()Ljava/lang/String;", "products", "", "Lcom/example/graphql/domain/Product;", "addProduct", "", "product", "equals", "", "other", "hashCode", "", "graphql"})
@jakarta.persistence.Entity
@jakarta.persistence.Table
public class Shop {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @jakarta.persistence.OneToOne(fetch = jakarta.persistence.FetchType.LAZY, cascade = {jakarta.persistence.CascadeType.ALL})
    @jakarta.persistence.JoinColumn(name = "member_id")
    private final com.example.graphql.domain.Owner owner = null;
    @org.jetbrains.annotations.Nullable
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    @jakarta.persistence.Id
    private final java.lang.Long id = null;
    @org.jetbrains.annotations.NotNull
    @org.springframework.data.annotation.CreatedDate
    private final java.time.LocalDateTime createdAt = null;
    @jakarta.persistence.OneToMany(fetch = jakarta.persistence.FetchType.LAZY, cascade = {jakarta.persistence.CascadeType.ALL}, orphanRemoval = true)
    @jakarta.persistence.JoinColumn(name = "shop_id")
    private final java.util.List<com.example.graphql.domain.Product> products = null;
    
    public Shop(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    com.example.graphql.domain.Owner owner) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.time.LocalDateTime getCreatedAt() {
        return null;
    }
    
    public void addProduct(@org.jetbrains.annotations.NotNull
    com.example.graphql.domain.Product product) {
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
}