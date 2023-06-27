package net.allm.challenge.repository

import net.allm.challenge.model.Hospital
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.PagingAndSortingRepository

interface HospitalRepository : PagingAndSortingRepository<Hospital, Long> {

    fun findHospitalsByNameContaining(name: String): List<Hospital>

    fun findHospitalsByNameContaining(name: String, pageable: Pageable): List<Hospital>
}
