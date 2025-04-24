package com.jindevst.springbootcleanarchboilterplate.domain.place

import jakarta.persistence.*
import java.util.*

@Table
@Entity
data class Place(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false, updatable = false)
    val id: UUID,

    @Column(nullable = false)
    val name: String,

    @Column(nullable = false)
    val address: String,

    @Column(nullable = false)
    val seatMaxCount: Short,

    @OneToMany(mappedBy = "place", cascade = [CascadeType.ALL], orphanRemoval = true, fetch = FetchType.LAZY)
    val seats: MutableList<Seat> = mutableListOf()
)
