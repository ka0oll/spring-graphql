package com.example.graphql.query;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017\u00a8\u0006\r"}, d2 = {"Lcom/example/graphql/query/ShopDao;", "Lorg/springframework/data/jpa/repository/support/QuerydslRepositorySupport;", "()V", "selectAll", "", "Lcom/example/graphql/domain/Shop;", "fetchType", "", "Lcom/example/graphql/query/FetchType;", "setEntityManager", "", "entityManager", "Ljakarta/persistence/EntityManager;", "graphql"})
@org.springframework.stereotype.Repository
@org.springframework.transaction.annotation.Transactional(readOnly = true)
public class ShopDao extends org.springframework.data.jpa.repository.support.QuerydslRepositorySupport {
    
    public ShopDao() {
        super(null);
    }
    
    @java.lang.Override
    @org.springframework.beans.factory.annotation.Autowired
    public void setEntityManager(@org.jetbrains.annotations.NotNull
    jakarta.persistence.EntityManager entityManager) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<com.example.graphql.domain.Shop> selectAll(@org.jetbrains.annotations.NotNull
    java.util.Set<? extends com.example.graphql.query.FetchType> fetchType) {
        return null;
    }
}