package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.data.dto.response.place

import com.jindevst.springbootcleanarchboilterplate.domain.place.SeatType
import java.util.*

data class GetPlacesResponse(
    val id: UUID,
    val name: String,
    val address: String,
    val seatMaxCount: Short,
    var seatInfo: Map<SeatType, Short>
)