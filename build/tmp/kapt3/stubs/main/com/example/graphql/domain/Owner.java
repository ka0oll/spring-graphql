package com.example.graphql.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0012X\u0093\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/example/graphql/domain/Owner;", "", "name", "", "(Ljava/lang/String;)V", "id", "", "Ljava/lang/Long;", "getName", "()Ljava/lang/String;", "graphql"})
@jakarta.persistence.Entity
@jakarta.persistence.Table
public class Owner {
    @org.jetbrains.annotations.NotNull
    @jakarta.persistence.Column(name = "name")
    private final java.lang.String name = null;
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    @jakarta.persistence.Id
    private final java.lang.Long id = null;
    
    public Owner(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getName() {
        return null;
    }
}