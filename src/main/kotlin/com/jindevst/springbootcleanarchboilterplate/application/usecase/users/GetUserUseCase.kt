package com.jindevst.springbootcleanarchboilterplate.application.usecase.users

import com.jindevst.springbootcleanarchboilterplate.domain.users.Users
import java.util.*

interface GetUserUseCase {
    fun getUsers(): List<Users>
    fun getUser(id: UUID): Users?
    fun getUserByEmail(email: String): Users?
}