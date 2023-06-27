package net.allm.challenge.api.model

import org.springframework.http.HttpStatus

class ApiResponse<T> {
    var status = 0
    var isSuccess = false
    var data: T? = null
        private set

    constructor() {}
    constructor(data: T) {
        status = HttpStatus.OK.value()
        isSuccess = true
        this.data = data
    }

    constructor(data: T, status: Int, success: Boolean) {
        this.status = status
        isSuccess = success
        this.data = data
    }

    fun setData(data: T) {
        this.data = data
    }
}
