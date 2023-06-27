package net.allm.challenge.repository

import net.allm.challenge.model.Patient
import org.springframework.data.repository.CrudRepository

interface PatientRepository : CrudRepository<Patient, Long> {

    fun findPatientByEmail(email: String): Patient?

}
