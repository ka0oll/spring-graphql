package com.example.graphql.domain

import jakarta.persistence.*

@Table
@Entity
class Owner(
    @Column(name="name")val name:String,
) {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private val id: Long? = null
}


