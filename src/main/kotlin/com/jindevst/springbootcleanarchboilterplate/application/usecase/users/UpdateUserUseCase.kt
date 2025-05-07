package com.jindevst.springbootcleanarchboilterplate.application.usecase.users

import com.jindevst.springbootcleanarchboilterplate.application.command.users.UpdateUserCommand
import java.util.*

interface UpdateUserUseCase {
    fun updateExecutes(command: UpdateUserCommand): UUID
}
