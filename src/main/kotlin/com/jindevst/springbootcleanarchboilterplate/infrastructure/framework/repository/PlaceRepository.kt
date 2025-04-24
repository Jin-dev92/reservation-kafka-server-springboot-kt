package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.repository

import com.jindevst.springbootcleanarchboilterplate.domain.place.Place
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface PlaceRepository : JpaRepository<Place, UUID> {}