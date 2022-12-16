package racingcar.domain

import racingcar.domain.model.Cars
import racingcar.utils.ZERO

class RacingManagement {

    lateinit var cars: Cars
    private var attemps = ZERO
    private var tryCount = ZERO

    private val carFactory = CarFactory(
        RandomNumberGenerator()
    )

    fun setCars(carNames: String) {
        cars = carFactory.generateCar(carNames)
    }

    fun setAttemps(attempsNumber: Int) {
        attemps = attempsNumber
    }

    fun race(): Cars {
        cars.move()
        tryCount++
        return cars
    }

    fun isEnded(): Boolean = tryCount != attemps
    fun finalWinnder(): List<String> = cars.getWinner()


}