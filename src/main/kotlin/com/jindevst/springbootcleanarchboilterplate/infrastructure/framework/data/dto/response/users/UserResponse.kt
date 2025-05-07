package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.data.dto.response.users

import com.jindevst.springbootcleanarchboilterplate.domain.users.Users  // Users 클래스 import 추가

import com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.data.dto.response.BaseResponseDto

class UserResponse : BaseResponseDto<Users>() {}