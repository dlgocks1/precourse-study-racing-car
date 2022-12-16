package racingcar.domain

import racingcar.domain.model.Car
import racingcar.domain.model.Cars

class CarFactory {

    fun generateCar(carNames: String): Cars {
        return Cars(divideFromComma(carNames).map {
            Car(it)
        })
    }

    private fun divideFromComma(str: String): List<String> = str.split(",")

}