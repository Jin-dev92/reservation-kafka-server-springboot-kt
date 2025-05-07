package com.jindevst.springbootcleanarchboilterplate.application.usecase.place

import com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.data.dto.response.place.GetPlacesResponse

interface GetPlaceUseCase {
    fun getPlaces(): List<GetPlacesResponse>
    fun getPlace():GetPlacesResponse?
}