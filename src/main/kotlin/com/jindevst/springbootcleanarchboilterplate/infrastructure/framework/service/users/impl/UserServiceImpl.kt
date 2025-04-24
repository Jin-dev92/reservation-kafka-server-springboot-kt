package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.service.users.impl

import com.jindevst.springbootcleanarchboilterplate.domain.users.Users
import com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.data.dto.request.users.CreateUserDto
import com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.data.dto.request.users.UpdateUserDto
import com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.repository.UserRepository
import com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.service.users.UserService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
class UserServiceImpl(
    private val userRepository: UserRepository
) : UserService {

    @Transactional(readOnly = true)
    override fun getUserExecutes(id: UUID): Users? {
        // usecase 를 통한 구현
        return this.userRepository.findById(id).orElse(null)
    }

    @Transactional(readOnly = true)
    override fun getUsersExecutes(): List<Users> {
        return this.userRepository.findAll()
    }

    @Transactional
    override fun createUserExecutes(body: CreateUserDto): Users {
        TODO("Not yet implemented")
    }

    @Transactional
    override fun updateUserExecutes(
        id: UUID,
        body: UpdateUserDto
    ): Users {
        TODO("Not yet implemented")
    }

    @Transactional
    override fun deleteUserExecutes(id: UUID) {
        TODO("Not yet implemented")
    }
}