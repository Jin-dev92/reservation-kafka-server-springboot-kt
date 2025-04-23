package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.service.users.impl

import com.jindevst.springbootcleanarchboilterplate.domain.users.Users
import com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.data.dto.request.users.CreateUserDto
import com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.data.dto.request.users.UpdateUserDto
import com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.service.users.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {
    override fun getUserExecutes(id: Long): Users? {
        // usecase 를 통한 구현
        TODO("Not yet implemented")
    }

    override fun getUsersExecutes(id: Long): List<Users> {
        TODO("Not yet implemented")
    }

    override fun createUserExecutes(body: CreateUserDto): Users {
        TODO("Not yet implemented")
    }

    override fun updateUserExecutes(id: Long, body: UpdateUserDto): Users {
        TODO("Not yet implemented")
    }

    override fun deleteUserExecutes(id: Long) {
        TODO("Not yet implemented")
    }
}