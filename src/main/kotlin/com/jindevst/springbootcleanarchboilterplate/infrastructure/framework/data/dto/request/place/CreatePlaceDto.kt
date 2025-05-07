package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.data.dto.request.place

import com.jindevst.springbootcleanarchboilterplate.domain.place.SeatType
import java.util.*


data class CreatePlaceDto(
    val name: String,
    val address: String,
    val seatMaxCount: Short,
    val seatInfo: Map<SeatType, List<UUID>>
)
