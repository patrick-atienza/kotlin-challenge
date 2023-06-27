package net.allm.challenge.api

import net.allm.challenge.api.model.ApiResponse
import net.allm.challenge.exception.AlreadyVisitSameTimeException
import net.allm.challenge.exception.VisitNotFoundException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

@ControllerAdvice
class CustomExceptionHandler : ResponseEntityExceptionHandler() {

    @ExceptionHandler(AlreadyVisitSameTimeException::class)
    fun handleAlreadyVisitSameTimeException(
        e: AlreadyVisitSameTimeException,
        request: WebRequest
    ): ResponseEntity<ApiResponse<String>> {
        val status = HttpStatus.BAD_REQUEST
        return ResponseEntity(ApiResponse(e.message, status.value(), false), status)
    }

    @ExceptionHandler(VisitNotFoundException::class)
    fun handleVisitNotFoundException(
        e: VisitNotFoundException,
        request: WebRequest
    ): ResponseEntity<ApiResponse<String>> {
        val status = HttpStatus.BAD_REQUEST
        return ResponseEntity(ApiResponse(e.message, status.value(), false), status)
    }
}
