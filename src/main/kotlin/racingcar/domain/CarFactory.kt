package racingcar.domain

import racingcar.domain.model.Car
import racingcar.domain.model.Cars

class CarFactory {

    fun generateCar(carNames: String): Cars {
        return Cars(carNames.split(",").map {
            Car(it)
        })
    }
}