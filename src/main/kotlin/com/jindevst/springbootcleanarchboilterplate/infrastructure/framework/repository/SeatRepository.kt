package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.repository

import com.jindevst.springbootcleanarchboilterplate.domain.place.Seat
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface SeatRepository : JpaRepository<Seat, UUID> {}