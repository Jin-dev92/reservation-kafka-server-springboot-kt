package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.service.users

import com.jindevst.springbootcleanarchboilterplate.domain.users.Users
import com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.data.dto.request.users.CreateUserDto
import com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.data.dto.request.users.UpdateUserDto

interface UserService {
    fun getUserExecutes(id: Long): Users?
    fun getUsersExecutes(id: Long): List<Users>
    fun createUserExecutes(body: CreateUserDto): Users
    fun updateUserExecutes(id: Long, body: UpdateUserDto): Users
    fun deleteUserExecutes(id: Long)
}