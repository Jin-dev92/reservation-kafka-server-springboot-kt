package com.jindevst.springbootcleanarchboilterplate.application.usecase.users

import com.jindevst.springbootcleanarchboilterplate.application.command.users.UpdateUserCommand
import com.jindevst.springbootcleanarchboilterplate.domain.users.Users

interface UpdateUserUseCase {
    fun executes(command: UpdateUserCommand): Users
}
