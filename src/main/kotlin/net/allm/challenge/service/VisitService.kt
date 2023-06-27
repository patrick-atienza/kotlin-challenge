package net.allm.challenge.service

import net.allm.challenge.model.Visit

interface VisitService {

    fun visit(hospitalId: Long, patientId: Long, dateEpoch: Long)

    fun cancelVisit(id: Long, patientId: Long)

    fun getVisits(patientId: Long): List<Visit>
}
