package com.jindevst.springbootcleanarchboilterplate.domain.place

import com.jindevst.springbootcleanarchboilterplate.domain.BaseEntity
import com.jindevst.springbootcleanarchboilterplate.domain.reservation.Reservation
import jakarta.persistence.*
import java.util.*

@Table
@Entity
data class Seat(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(nullable = false, updatable = false)
    val id: UUID,

    @Column(nullable = false)
    val seatNumber: Short,

    @Column(nullable = false)
    val type: SeatType = SeatType.일반,

    @Column(nullable = false)
    val status: SeatStatus = SeatStatus.예매_가능,

    /* 연관 관계 */

    @ManyToOne
    var place: Place,

    @OneToOne(cascade = [CascadeType.ALL], orphanRemoval = true)
    var reservation: Reservation,
) : BaseEntity()


enum class SeatType {
    일반,
    임산부_우대,
    노약자
}
enum class SeatStatus{
    예매_가능,
    예매_불가,
    예약_대기
}