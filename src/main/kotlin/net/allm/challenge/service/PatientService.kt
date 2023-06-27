package net.allm.challenge.service

import net.allm.challenge.model.Patient

interface PatientService {

    fun getByEmail(email: String): Patient?
}
