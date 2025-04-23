package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.data.dto.response

import lombok.Builder


@Builder
open class BaseResponseDto {
    var code: Int = 200
    var message: String = ""
    var data: Any? = null
}