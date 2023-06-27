package net.allm.challenge.model

import jakarta.persistence.*

@Table(
    name = "hospitals",
    indexes = [Index(columnList = "id")]
)
@Entity
data class Hospital(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    var name: String? = null
)

