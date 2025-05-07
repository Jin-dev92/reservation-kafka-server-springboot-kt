package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.service.place

import com.jindevst.springbootcleanarchboilterplate.application.command.place.CreatePlaceCommand
import com.jindevst.springbootcleanarchboilterplate.application.command.place.UpdatePlaceCommand
import com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.data.dto.response.place.GetPlacesResponse
import com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.repository.PlaceRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class PlaceServiceImpl(
    private val placeRepository: PlaceRepository
) : PlaceService {
    override fun createExecute(command: CreatePlaceCommand) {
        TODO("Not yet implemented")
    }

    override fun updateExecutes(command: UpdatePlaceCommand): UUID {
        TODO("Not yet implemented")
    }

    override fun getPlaces(): List<GetPlacesResponse> {
        TODO("Not yet implemented")
    }

    override fun getPlace(): GetPlacesResponse? {
        TODO("Not yet implemented")
    }

    override fun deleteExecute(placeId: UUID): UUID {
        TODO("Not yet implemented")
    }
}