package com.example.graphql.config

import graphql.analysis.MaxQueryDepthInstrumentation
import graphql.schema.Coercing
import graphql.schema.GraphQLScalarType
import graphql.schema.idl.RuntimeWiring
import org.springframework.boot.autoconfigure.graphql.GraphQlSourceBuilderCustomizer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.graphql.execution.GraphQlSource.SchemaResourceBuilder
import java.time.LocalDateTime
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter


@Configuration
class GraphQlConfig {

    @Bean
    fun sourceBuilderCustomizer(): GraphQlSourceBuilderCustomizer? {
        return GraphQlSourceBuilderCustomizer { builder: SchemaResourceBuilder ->
            builder.instrumentation(listOf(
                MaxQueryDepthInstrumentation(5),
            ))

            builder.configureRuntimeWiring {
                it.scalar(dateTime)
            }
        }
    }

}



val dateTime = GraphQLScalarType.newScalar()
    .name("DateTime")
    .description("A custom scalar that handles emails")
    .coercing(object : Coercing<LocalDateTime, String> {
        override fun serialize(dataFetcherResult: Any): String {
            return (dataFetcherResult as LocalDateTime).format(DateTimeFormatter.ISO_DATE_TIME)
        }

        override fun parseValue(input: Any): LocalDateTime {
            return LocalDateTime.parse(input as String)
        }

        override fun parseLiteral(input: Any): LocalDateTime {
            return LocalDateTime.parse(input as String)
        }
    })
    .build()
