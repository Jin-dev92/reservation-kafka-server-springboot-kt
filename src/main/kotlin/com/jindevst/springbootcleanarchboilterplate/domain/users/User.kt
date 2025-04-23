package com.jindevst.springbootcleanarchboilterplate.domain.users

import com.jindevst.springbootcleanarchboilterplate.domain.BaseEntity
import jakarta.persistence.*
import java.util.*

enum class UserRole {
    USER, ADMIN
}

@Entity
@Table(name = "users")
data class Users(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false, updatable = false)
    val id: UUID? = null,

    @Column(nullable = false, length = 50)
    var name: String,

    @Column(nullable = false, unique = true, length = 100)
    var email: String,

    @Column(nullable = false)
    var password: String,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    var role: UserRole = UserRole.USER
) : BaseEntity()