package racingcar.domain

import racingcar.domain.model.Car
import racingcar.domain.model.Cars

class CarFactory(private val randomNumberGenerator: NumberGenerator) {

    fun generateCar(carNames: String): Cars {
        return Cars(
            cars = divideFromComma(carNames).map {
                Car(it)
            },
            numberGenerator = randomNumberGenerator
        )
    }

    private fun divideFromComma(str: String): List<String> = str.split(",")

}