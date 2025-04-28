package com.jindevst.springbootcleanarchboilterplate.application.command.place

import com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.data.dto.request.place.CreatePlaceDto

data class UpdatePlaceCommand(val dto: CreatePlaceDto) {
    init {
        require(dto.name.isNotBlank()) { "name is blank" }
        require(dto.address.isNotBlank()) { "address is blank" }
        require(dto.seatMaxCount > 0) { "seatMaxCount larger than 0" }
    }
}
