package com.example.graphql.domain

import jakarta.persistence.*


@Table
@Entity
class Product (
    @Column(name="name")val name:String,
    @Column(name="description") val description:String
){
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private val id: Long? = null
}

