package net.allm.challenge.service

import jakarta.transaction.Transactional
import net.allm.challenge.exception.AlreadyVisitSameTimeException
import net.allm.challenge.exception.VisitNotFoundException
import net.allm.challenge.model.Hospital
import net.allm.challenge.model.Patient
import net.allm.challenge.model.Visit
import net.allm.challenge.repository.VisitRepository
import org.springframework.stereotype.Service
import java.sql.Timestamp

@Service
class VisitServiceImpl(
    private val repository: VisitRepository
) : VisitService {

    override fun visit(hospitalId: Long, patientId: Long, dateEpoch: Long) {
        val existingVisit =
            repository.findVisitByHospitalIdAndPatientIdAndDate(hospitalId, patientId, Timestamp(dateEpoch))
        if (existingVisit != null) {
            throw AlreadyVisitSameTimeException()
        }
        repository.save(
            Visit(
                hospital = Hospital(id = hospitalId), patient = Patient(id = patientId), date = Timestamp(dateEpoch)
            )
        )
    }

    @Transactional
    override fun cancelVisit(id: Long, patientId: Long) {
        repository.findVisitByIdAndPatientId(id, patientId) ?: throw VisitNotFoundException()
        repository.deleteVisitById(id)
    }

    override fun getVisits(patientId: Long): List<Visit> {
        return repository.findVisitsByPatientId(patientId)
    }
}
