package com.jindevst.springbootcleanarchboilterplate.domain.place

import com.jindevst.springbootcleanarchboilterplate.domain.BaseEntity
import jakarta.persistence.*
import java.util.*

@Table
@Entity
data class Place(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false, updatable = false)
    val id: UUID? = null,

    @Column(nullable = false, unique = true)
    val name: String,

    @Column(nullable = false)
    val address: String,

    @Column(nullable = false)
    val seatMaxCount: Short,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val status: PlaceStatus = PlaceStatus.예약대기,

    @OneToMany(mappedBy = "place", cascade = [CascadeType.ALL], orphanRemoval = true, fetch = FetchType.LAZY)
    val seats: MutableList<Seat> = mutableListOf()
) : BaseEntity()

enum class PlaceStatus {
    예약가능,
    예약불가,
    예약대기
}