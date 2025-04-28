package com.jindevst.springbootcleanarchboilterplate.domain.order

import com.jindevst.springbootcleanarchboilterplate.domain.BaseEntity
import jakarta.persistence.*
import java.util.*

@Table
@Entity
data class Orders(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false, updatable = false)
    val id: UUID,

    @Column(nullable = false, updatable = false, unique = true)
    var orderNumber: String,

    @OneToOne(cascade = [CascadeType.ALL], orphanRemoval = true)
    var payment: Payment,
) : BaseEntity()
