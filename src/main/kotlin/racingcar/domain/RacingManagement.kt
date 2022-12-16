package racingcar.domain

import racingcar.domain.model.Cars

class RacingManagement {

    lateinit var cars: Cars
    private var attemps = 0
    private var tryCount = 0

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
        tryCount += 1
        return cars
    }

    fun isEnded(): Boolean = tryCount != attemps
    fun finalWinnder(): List<String> = cars.getWinner()


}