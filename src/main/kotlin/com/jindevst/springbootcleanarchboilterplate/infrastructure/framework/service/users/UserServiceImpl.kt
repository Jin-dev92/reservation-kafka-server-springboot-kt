package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.service.users

import com.jindevst.springbootcleanarchboilterplate.application.command.users.CreateUserCommand
import com.jindevst.springbootcleanarchboilterplate.application.command.users.UpdateUserCommand
import com.jindevst.springbootcleanarchboilterplate.domain.users.Users
import com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserServiceImpl(
    private val userRepository: UserRepository
) : UserService {
    override fun createExecutes(command: CreateUserCommand) {
        TODO("Not yet implemented")
    }

    override fun updateExecutes(command: UpdateUserCommand): UUID {
        TODO("Not yet implemented")
    }

    override fun deleteExecutes(userId: UUID): UUID {
        TODO("Not yet implemented")
    }

    override fun getUsers(): List<Users> {
        TODO("Not yet implemented")
    }

    override fun getUser(id: UUID): Users? {
        TODO("Not yet implemented")
    }

    override fun getUserByEmail(email: String): Users? {
        TODO("Not yet implemented")
    }
}