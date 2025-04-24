package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.repository

import com.jindevst.springbootcleanarchboilterplate.domain.reservation.Reservation
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ReservationRepository : JpaRepository<Reservation, UUID> {}