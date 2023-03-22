package com.example.kotlin.booas.model

import jakarta.persistence.*


@Entity(name = "persona")
data class Persona(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
        @Column
        val nombre: String = "",
        @Column
        val apellido: String = "",
        @Column
        val email: String = "",
        @Column
        val phone: String = "") {}
