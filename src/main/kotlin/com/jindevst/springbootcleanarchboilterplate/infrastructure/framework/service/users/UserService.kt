package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.service.users

import com.jindevst.springbootcleanarchboilterplate.domain.users.Users
import com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.data.dto.request.users.CreateUserDto
import com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.data.dto.request.users.UpdateUserDto
import java.util.*

interface UserService {
    fun getUserExecutes(id: UUID): Users?
    fun getUsersExecutes(): List<Users>
    fun createUserExecutes(body: CreateUserDto): Users
    fun updateUserExecutes(id: UUID, body: UpdateUserDto): Users
    fun deleteUserExecutes(id: UUID)
}