package com.jindevst.springbootcleanarchboilterplate.application.usecase.users

import com.jindevst.springbootcleanarchboilterplate.application.command.users.CreateUserCommand

interface CreateUserUseCase {
    fun createExecutes(command: CreateUserCommand)
}