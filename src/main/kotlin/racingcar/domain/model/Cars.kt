package racingcar.domain.model

import racingcar.domain.NumberGenerator

class Cars(private val cars: List<Car>, private val numberGenerator: NumberGenerator) : List<Car> by cars {

    fun move() {
        cars.forEach { car ->
            car.move(numberGenerator)
        }
    }

}
