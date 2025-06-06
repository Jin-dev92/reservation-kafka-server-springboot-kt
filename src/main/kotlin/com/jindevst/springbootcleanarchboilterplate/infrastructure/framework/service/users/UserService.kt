package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.service.users

import com.jindevst.springbootcleanarchboilterplate.application.usecase.users.CreateUserUseCase
import com.jindevst.springbootcleanarchboilterplate.application.usecase.users.DeleteUserUseCase
import com.jindevst.springbootcleanarchboilterplate.application.usecase.users.GetUserUseCase
import com.jindevst.springbootcleanarchboilterplate.application.usecase.users.UpdateUserUseCase

interface UserService: CreateUserUseCase, UpdateUserUseCase, DeleteUserUseCase, GetUserUseCase