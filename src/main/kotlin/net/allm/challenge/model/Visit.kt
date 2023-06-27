package net.allm.challenge.model

import jakarta.persistence.*
import java.sql.Timestamp

@Table(
    name = "visits",
    indexes = [Index(columnList = "id")]
)
@Entity
data class Visit(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @ManyToOne
    @JoinColumn(name = "hospital_id", nullable = false)
    var hospital: Hospital? = null,

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    var patient: Patient? = null,

    var date: Timestamp? = null
)
