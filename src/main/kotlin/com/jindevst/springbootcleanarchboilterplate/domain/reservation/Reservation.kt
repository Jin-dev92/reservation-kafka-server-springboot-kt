package com.jindevst.springbootcleanarchboilterplate.domain.reservation

import com.jindevst.springbootcleanarchboilterplate.domain.BaseEntity
import com.jindevst.springbootcleanarchboilterplate.domain.place.Place
import jakarta.persistence.*
import java.util.*

@Entity
@Table
data class Reservation(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false, updatable = false)
    val id: UUID,

    @Column(nullable = false, updatable = false)
    var orderNumber: String,

    @ManyToOne(fetch = FetchType.LAZY)
    var place: Place? = null
) : BaseEntity()