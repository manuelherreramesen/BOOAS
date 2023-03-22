package com.example.kotlin.booas.repository

import com.example.kotlin.booas.model.Persona
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonaRepository : CrudRepository<Persona, Long> {
}