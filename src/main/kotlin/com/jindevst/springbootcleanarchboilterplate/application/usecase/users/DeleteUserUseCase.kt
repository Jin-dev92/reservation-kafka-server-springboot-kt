package com.jindevst.springbootcleanarchboilterplate.application.usecase.users

import java.util.*

interface DeleteUserUseCase {
    fun deleteExecutes(userId: UUID): UUID
}