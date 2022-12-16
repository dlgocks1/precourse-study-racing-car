package racingcar.domain.model

import racingcar.domain.NumberGenerator
import racingcar.utils.*
import racingcar.utils.ERROR.CAR_NAME_LENGTH
import kotlin.text.StringBuilder

class Car(private val name: String) {

    private var position: Int = 0

    init {
        validateName(name)
    }

    override fun toString(): String {
        val carState = StringBuilder()
        carState.append("$name : ")
        carState.append(position.addResults())
        return carState.toString()
    }


    fun getName(): String = name

    fun getPosition(): Int = position

    fun move(numberGenerator: NumberGenerator) {
        if (numberGenerator.generate() >= MINIMUN_CAR_SPEED) {
            position += ONE
        }
    }

    private fun validateName(name: String) {
        require(name.length in MINIMUN_CAR_NAME_LENGTH..MAXIMUN_CAR_NAME_LENGTH) {
            CAR_NAME_LENGTH
        }
    }

}
