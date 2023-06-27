package net.allm.challenge.service

import net.allm.challenge.model.Hospital
import net.allm.challenge.repository.HospitalRepository
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import org.springframework.stereotype.Service

@Service
class HospitalServiceImpl(
    private val repository: HospitalRepository
) : HospitalService {

    override fun getAll(page: Int?, size: Int?): List<Hospital> {
        return if (page == null || size == null) {
            repository.findAll(Sort.unsorted()).toList()
        } else {
            repository.findAll(PageRequest.of(page, size)).toList()
        }
    }

    override fun getByName(hospital: String, page: Int?, size: Int?): List<Hospital> {
        return if (page == null || size == null) {
            repository.findHospitalsByNameContaining(hospital)
        } else {
            repository.findHospitalsByNameContaining(hospital, PageRequest.of(page, size))
        }
    }


}
