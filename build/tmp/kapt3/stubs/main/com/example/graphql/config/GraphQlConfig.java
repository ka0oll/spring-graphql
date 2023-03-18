package com.example.graphql.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0017\u00a8\u0006\u0005"}, d2 = {"Lcom/example/graphql/config/GraphQlConfig;", "", "()V", "sourceBuilderCustomizer", "Lorg/springframework/boot/autoconfigure/graphql/GraphQlSourceBuilderCustomizer;", "graphql"})
@org.springframework.context.annotation.Configuration
public class GraphQlConfig {
    
    public GraphQlConfig() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @org.springframework.context.annotation.Bean
    public org.springframework.boot.autoconfigure.graphql.GraphQlSourceBuilderCustomizer sourceBuilderCustomizer() {
        return null;
    }
}