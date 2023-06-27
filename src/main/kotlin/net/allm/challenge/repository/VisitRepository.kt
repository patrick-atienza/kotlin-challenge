package net.allm.challenge.repository

import net.allm.challenge.model.Visit
import org.springframework.data.repository.CrudRepository
import java.sql.Timestamp

interface VisitRepository : CrudRepository<Visit, Long> {

    fun deleteVisitById(id: Long): Int

    fun findVisitsByPatientId(patientId: Long): List<Visit>

    fun findVisitByHospitalIdAndPatientIdAndDate(hospitalId: Long, patientId: Long, date: Timestamp): Visit?

    fun findVisitByIdAndPatientId(id: Long, patientId: Long): Visit?
}
