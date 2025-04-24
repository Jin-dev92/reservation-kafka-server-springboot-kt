package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.data.dto.response

open class BaseResponseDto<T> {
    var code: Int = 200
    var message: String = ""
    var data: T? = null
}