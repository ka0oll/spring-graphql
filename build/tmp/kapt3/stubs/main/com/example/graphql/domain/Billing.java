package com.example.graphql.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0012X\u0093\u0004\u00a2\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/example/graphql/domain/Billing;", "", "shopId", "", "price", "", "(JI)V", "id", "Ljava/lang/Long;", "getPrice", "()I", "getShopId", "()J", "graphql"})
@jakarta.persistence.Entity
@jakarta.persistence.Table
public class Billing {
    private final long shopId = 0L;
    private final int price = 0;
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    @jakarta.persistence.Id
    private final java.lang.Long id = null;
    
    public Billing(long shopId, int price) {
        super();
    }
    
    public long getShopId() {
        return 0L;
    }
    
    public int getPrice() {
        return 0;
    }
}