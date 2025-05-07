package com.jindevst.springbootcleanarchboilterplate.application.usecase.place

import com.jindevst.springbootcleanarchboilterplate.application.command.place.CreatePlaceCommand

interface CreatePlaceUseCase {
    fun createExecute(command: CreatePlaceCommand)
}