package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.repository

import com.jindevst.springbootcleanarchboilterplate.domain.order.Payment
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface PaymentRepository : JpaRepository<Payment, UUID> {}