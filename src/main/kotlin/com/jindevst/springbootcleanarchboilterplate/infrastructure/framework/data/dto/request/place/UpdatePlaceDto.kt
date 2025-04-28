package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.data.dto.request.place


data class UpdatePlaceDto(
    val name: String,
    val address: String,
    val seatMaxCount: Short,
)
