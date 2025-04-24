package com.jindevst.springbootcleanarchboilterplate.application.usecase.users

import com.jindevst.springbootcleanarchboilterplate.application.command.users.CreateUserCommand
import java.util.*

interface CreateUserUseCase {
    fun execute(command: CreateUserCommand): UUID
}