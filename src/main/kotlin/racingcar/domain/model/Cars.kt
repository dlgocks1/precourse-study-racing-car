package racingcar.domain.model

import racingcar.domain.NumberGenerator

class Cars(private val cars: List<Car>, private val numberGenerator: NumberGenerator) : List<Car> by cars {

    fun move() {
        cars.forEach { car ->
            car.move(numberGenerator)
        }
    }

    fun getWinner(): List<Car> {
        val winnerPosition = cars.maxOf { it.getPosition() }
        cars.filter { it.getPosition() == winnerPosition }
        return cars
    }

}
