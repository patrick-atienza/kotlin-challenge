package net.allm.challenge.service

import net.allm.challenge.model.Patient
import net.allm.challenge.repository.PatientRepository
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
class PatientServiceImpl(
    private val repository: PatientRepository
) : PatientService, UserDetailsService {

    override fun loadUserByUsername(email: String): UserDetails? {
        return repository.findPatientByEmail(email)
    }

    override fun getByEmail(email: String): Patient? {
        return repository.findPatientByEmail(email)
    }


}
