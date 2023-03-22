package com.example.kotlin.booas.service.impl

import com.example.kotlin.booas.common.GenericServiceImpl
import com.example.kotlin.booas.model.Persona
import com.example.kotlin.booas.repository.PersonaRepository
import com.example.kotlin.booas.service.api.PersonaServiceApi
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service

@Service
class PersonaServiceImpl : GenericServiceImpl<Persona, Long>(), PersonaServiceApi {

    @Autowired
    lateinit var personaRepository: PersonaRepository

    override val myDao: CrudRepository<Persona, Long>
        get() = personaRepository
}