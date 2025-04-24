package com.jindevst.springbootcleanarchboilterplate.application.command.users

import com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.data.dto.request.users.CreateUserDto

data class CreateUserCommand(val dto: CreateUserDto) {
    init {
        require(dto.name.isNotBlank()) { "name is blank" }
        require(dto.email.isNotBlank()) { "email is blank" }
        require(dto.password.isNotBlank()) { "password is blank" }
    }
}
