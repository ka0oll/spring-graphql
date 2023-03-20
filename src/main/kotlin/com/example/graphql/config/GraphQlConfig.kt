package com.example.graphql.config

import graphql.ExecutionResult
import graphql.analysis.MaxQueryDepthInstrumentation
import graphql.execution.instrumentation.InstrumentationContext
import graphql.execution.instrumentation.SimpleInstrumentationContext
import graphql.execution.instrumentation.parameters.InstrumentationExecuteOperationParameters
import graphql.schema.Coercing
import graphql.schema.GraphQLScalarType
import org.springframework.boot.autoconfigure.graphql.GraphQlSourceBuilderCustomizer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.graphql.execution.GraphQlSource.SchemaResourceBuilder
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


@Configuration
class GraphQlConfig {

    @Bean
    fun sourceBuilderCustomizer(): GraphQlSourceBuilderCustomizer? {
        return GraphQlSourceBuilderCustomizer { builder: SchemaResourceBuilder ->
            builder.instrumentation(listOf(
                CustomMaxQueryDepthInstrumentation(5)
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


class CustomMaxQueryDepthInstrumentation(maxDepth:Int): MaxQueryDepthInstrumentation(maxDepth){

    override fun beginExecuteOperation( parameters:InstrumentationExecuteOperationParameters):InstrumentationContext<ExecutionResult> {
        try {
            if(parameters.executionContext.executionInput.operationName.equals("IntrospectionQuery", true)){
                return SimpleInstrumentationContext.noOp()
            }
        }catch (e:Exception){
            //nothing
        }

        return super.beginExecuteOperation(parameters)
    }
}
