package net.allm.challenge.service

import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.mockk
import net.allm.challenge.exception.AlreadyVisitSameTimeException
import net.allm.challenge.exception.VisitNotFoundException
import net.allm.challenge.repository.VisitRepository
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.sql.Timestamp

@SpringBootTest
class VisitServiceImplTests {

    @InjectMockKs
    private lateinit var service: VisitServiceImpl

    @MockK
    private lateinit var repository: VisitRepository

    val testHospitalId: Long = 1
    val testPatientId: Long = 2
    val testDateEpoch: Long = 123456
    val testId: Long = 7

    @BeforeEach
    fun setup() {
        MockKAnnotations.init(this)
    }

    @Test
    fun `When visit is already scheduled the same time, throw AlreadyVisitSameTimeException`() {
        every {
            repository.findVisitByHospitalIdAndPatientIdAndDate(
                testHospitalId,
                testPatientId,
                Timestamp(testDateEpoch)
            )
        } returns mockk()
        Assertions.assertThrows(AlreadyVisitSameTimeException::class.java) {
            service.visit(testHospitalId, testPatientId, testDateEpoch)
        }
    }

    @Test
    fun `When visit does not exist, throw VisitNotFoundException`() {
        every {
            repository.findVisitByIdAndPatientId(
                testId, testPatientId
            )
        } returns null
        Assertions.assertThrows(VisitNotFoundException::class.java) {
            service.cancelVisit(testId, testPatientId)
        }
    }


}
