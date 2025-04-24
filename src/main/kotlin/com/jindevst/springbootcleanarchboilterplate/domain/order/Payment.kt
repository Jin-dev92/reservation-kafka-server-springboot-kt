package com.jindevst.springbootcleanarchboilterplate.domain.order

import com.jindevst.springbootcleanarchboilterplate.domain.BaseEntity
import jakarta.persistence.*
import java.util.*

@Table
@Entity
data class Payment(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false, updatable = false)
    val id: UUID,

    @Column(nullable = false, updatable = false, unique = true)
    var paymentNumber: String,

    @OneToOne(mappedBy = "payment")
    var order: Order,
) : BaseEntity()
