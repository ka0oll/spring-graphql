package com.example.graphql.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBilling is a Querydsl query type for Billing
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBilling extends EntityPathBase<Billing> {

    private static final long serialVersionUID = 350132967L;

    public static final QBilling billing = new QBilling("billing");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final NumberPath<Long> shopId = createNumber("shopId", Long.class);

    public QBilling(String variable) {
        super(Billing.class, forVariable(variable));
    }

    public QBilling(Path<? extends Billing> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBilling(PathMetadata metadata) {
        super(Billing.class, metadata);
    }

}

