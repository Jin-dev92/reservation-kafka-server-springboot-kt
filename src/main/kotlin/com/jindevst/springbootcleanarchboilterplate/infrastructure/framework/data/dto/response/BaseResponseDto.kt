package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.data.dto.response

@Builder
open class BaseResponseDto {
    var code: Int = 200
    var message: String = ""
    var data: Any? = null
}