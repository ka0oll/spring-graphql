package com.example.graphql.domain

import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import java.time.LocalDateTime
import java.time.ZonedDateTime
import kotlin.math.absoluteValue
import kotlin.random.Random

@Table
@Entity
class Billing (
    val shopId:Long,
    val price:Int = Random.nextInt().absoluteValue
){




    @Id  @GeneratedValue(strategy= GenerationType.AUTO)
    private val id: Long? = null

}

