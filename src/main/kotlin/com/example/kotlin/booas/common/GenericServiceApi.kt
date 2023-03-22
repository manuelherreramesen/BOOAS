package com.example.kotlin.booas.common

import com.example.kotlin.booas.model.Persona
import org.springframework.data.repository.CrudRepository
import java.io.Serializable


interface GenericServiceApi<T, ID : Serializable?> {
    fun save(entity: T): T
    fun delete(id: ID)
    operator fun get(id: ID): T?
    val all: MutableList<T>?
}