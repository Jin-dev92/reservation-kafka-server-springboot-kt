package com.jindevst.springbootcleanarchboilterplate.application.usecase.place

import java.util.*

interface DeletePlaceUseCase {
    fun deleteExecute(placeId: UUID): UUID
}