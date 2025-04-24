package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.data.dto.request.users

import com.jindevst.springbootcleanarchboilterplate.domain.users.UserRole

data class UpdateUserDto(
    var name: String,
    var email: String,
    var password: String,
    var role: UserRole = UserRole.USER
)