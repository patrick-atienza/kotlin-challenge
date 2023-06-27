package net.allm.challenge.service

import net.allm.challenge.model.Hospital

interface HospitalService {

    fun getAll(page: Int?, size: Int?): List<Hospital>

    fun getByName(hospital: String, page: Int?, size: Int?): List<Hospital>

}
