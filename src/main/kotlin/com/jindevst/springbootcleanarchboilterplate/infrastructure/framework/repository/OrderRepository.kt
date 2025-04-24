package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.repository

import com.jindevst.springbootcleanarchboilterplate.domain.order.Order
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface OrderRepository : JpaRepository<Order, UUID> {}