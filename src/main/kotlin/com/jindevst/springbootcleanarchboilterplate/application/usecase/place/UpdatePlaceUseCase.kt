package com.jindevst.springbootcleanarchboilterplate.application.usecase.place

import com.jindevst.springbootcleanarchboilterplate.application.command.place.UpdatePlaceCommand
import java.util.*

interface UpdatePlaceUseCase {
    fun updateExecutes(command: UpdatePlaceCommand): UUID
}
