package com.example.graphql.domain

import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import java.time.LocalDateTime
import kotlin.random.Random

@Table
@Entity
class Shop (
    val name:String,

    @JoinColumn(name="member_id")
    @OneToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    private val owner:Owner
){


    @Id  @GeneratedValue(strategy= GenerationType.AUTO)
    val id: Long? = Random.nextLong()

    @CreatedDate
    val createdAt:LocalDateTime = LocalDateTime.now()



    @JoinColumn(name = "shop_id")
    @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL], orphanRemoval = true)
    private val products:MutableList<Product> = mutableListOf()

    fun addProduct(product: Product){
        this.products.add(product)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Shop) return false

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }


}

