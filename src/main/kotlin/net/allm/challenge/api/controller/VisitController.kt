package net.allm.challenge.api.controller

import io.swagger.annotations.ApiOperation
import net.allm.challenge.api.model.ApiResponse
import net.allm.challenge.api.model.GetVisitsResponse
import net.allm.challenge.service.PatientService
import net.allm.challenge.service.VisitService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.security.Principal

@RestController
@RequestMapping("/v1/visits")
class VisitController(
    private val service: VisitService,
    private val patientService: PatientService
) {

    @ApiOperation("Schedule a visit")
    @PostMapping
    fun visit(
        @RequestParam("hospitalId") hospitalId: Long,
        @RequestParam("date") dateEpoch: Long,
        principal: Principal
    ): ResponseEntity<ApiResponse<String>> {
        val patientId = patientService.getByEmail(principal.name)?.id
        service.visit(hospitalId, patientId!!, dateEpoch)
        return ResponseEntity.ok(ApiResponse("Visit scheduled."))
    }

    @ApiOperation("Cancel a visit")
    @DeleteMapping
    fun cancelVisit(
        @RequestParam("id") id: Long,
        principal: Principal
    ): ResponseEntity<ApiResponse<String>> {
        val patientId = patientService.getByEmail(principal.name)?.id
        service.cancelVisit(id, patientId!!)
        return ResponseEntity.ok(ApiResponse("Scheduled visit canceled."))
    }

    @ApiOperation("List all visits")
    @GetMapping
    fun getVisits(principal: Principal): ResponseEntity<ApiResponse<List<GetVisitsResponse>>> {
        val patientId = patientService.getByEmail(principal.name)?.id
        val result = service.getVisits(patientId!!)
        val mappedResult = result.map { p -> GetVisitsResponse(p.id!!, p.hospital!!, p.date!!.toString()) }
        return ResponseEntity.ok(ApiResponse(mappedResult))
    }

}
