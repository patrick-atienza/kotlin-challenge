package net.allm.challenge.api.controller

import io.swagger.annotations.ApiOperation
import net.allm.challenge.api.model.ApiResponse
import net.allm.challenge.model.Hospital
import net.allm.challenge.service.HospitalService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/hospitals")
class HospitalController(
    private val service: HospitalService
) {

    @ApiOperation("List all hospitals")
    @GetMapping
    fun getAll(
        @RequestParam("page") page: Int?,
        @RequestParam("size") size: Int?,
    ): ResponseEntity<ApiResponse<List<Hospital>>> {
        val result = service.getAll(page, size)
        return ResponseEntity.ok(ApiResponse(result))
    }

    @ApiOperation("List hospitals by name")
    @GetMapping("/{name}")
    fun get(
        @PathVariable("name") name: String, @RequestParam("page") page: Int?,
        @RequestParam("size") size: Int?
    ): ResponseEntity<ApiResponse<List<Hospital>>> {
        val result = service.getByName(name, page, size)
        return ResponseEntity.ok(ApiResponse(result))
    }


}
