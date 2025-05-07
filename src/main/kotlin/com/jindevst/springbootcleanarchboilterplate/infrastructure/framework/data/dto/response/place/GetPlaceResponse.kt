package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.data.dto.response.place

import com.jindevst.springbootcleanarchboilterplate.domain.place.Seat
import java.util.*

data class GetPlaceResponse(
    val id: UUID,
    val name: String,
    val address: String,
    val seatMaxCount: Short,
    var seatInfo: List<Seat>
)
