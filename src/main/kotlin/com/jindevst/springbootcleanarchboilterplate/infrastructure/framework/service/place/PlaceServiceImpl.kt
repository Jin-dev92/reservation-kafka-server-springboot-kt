package com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.service.place

import com.jindevst.springbootcleanarchboilterplate.application.command.place.CreatePlaceCommand
import com.jindevst.springbootcleanarchboilterplate.application.command.place.UpdatePlaceCommand
import com.jindevst.springbootcleanarchboilterplate.domain.place.*
import com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.data.dto.response.place.GetPlacesResponse
import com.jindevst.springbootcleanarchboilterplate.infrastructure.framework.repository.PlaceRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service
import java.util.*

@Service
class PlaceServiceImpl(
    private val placeRepository: PlaceRepository
) : PlaceService {

    @Transactional
    override fun createExecute(command: CreatePlaceCommand) {
        try {
            var place = Place(
                name = command.dto.name,
                address = command.dto.address,
                seatMaxCount = command.dto.seatMaxCount,
                status = PlaceStatus.예약대기
            )

            // 이미 등록된 좌석 번호들을 저장할 Set
            val registeredSeatNumbers = mutableSetOf<Short>()

            // 특별 좌석 정보(seatInfo)를 기반으로 특별 좌석 생성
            command.dto.seatInfo.forEach { (seatType, seatNumbers) ->
                seatNumbers.forEach { seatNumber ->
                    // 좌석 번호가 최대 좌석 수를 초과하지 않는지 확인
                    if (seatNumber <= command.dto.seatMaxCount) {
                        val seat = Seat(
                            seatNumber = seatNumber,
                            type = seatType,  // 특별 타입 (지정된 타입)
                            status = SeatStatus.예매_가능,
                            place = place,
                            reservation = null
                        )
                        place.seats.add(seat)
                        registeredSeatNumbers.add(seatNumber)
                    }
                }
            }

            // seatMaxCount를 기반으로 나머지 일반 좌석 생성
            for (seatNumber in 1..command.dto.seatMaxCount) {
                // 이미 등록된 좌석 번호가 아닌 경우만 생성
                if (registeredSeatNumbers.contains(seatNumber.toShort())) continue
                val seat = Seat(
                    seatNumber = seatNumber.toShort(),
                    type = SeatType.일반,  // 기본 타입으로 설정
                    status = SeatStatus.예매_가능,
                    place = place,
                    reservation = null
                )
                place.seats.add(seat)
            }

            placeRepository.save(place)
        } catch (e: Exception) {
            throw IllegalArgumentException("place already exists")
        }
    }

    override fun updateExecutes(command: UpdatePlaceCommand): UUID? {
        var place = checkPlace(command.dto.name)

        return place.id
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

    private fun checkPlace(name: String): Place {
        return placeRepository.findByName(name).orElseThrow {
            throw IllegalArgumentException("place not found")
        }
    }
}