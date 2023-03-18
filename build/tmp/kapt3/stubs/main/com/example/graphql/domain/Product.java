package com.example.graphql.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0016\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0012X\u0093\u0004\u00a2\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007\u00a8\u0006\f"}, d2 = {"Lcom/example/graphql/domain/Product;", "", "name", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "id", "", "Ljava/lang/Long;", "getName", "graphql"})
@jakarta.persistence.Entity
@jakarta.persistence.Table
public class Product {
    @org.jetbrains.annotations.NotNull
    @jakarta.persistence.Column(name = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    @jakarta.persistence.Column(name = "description")
    private final java.lang.String description = null;
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    @jakarta.persistence.Id
    private final java.lang.Long id = null;
    
    public Product(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String description) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getDescription() {
        return null;
    }
}