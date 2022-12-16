package racingcar.domain.model

import racingcar.domain.NumberGenerator
import racingcar.utils.addResults
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
        if (numberGenerator.generate() >= 4) {
            position += 1
        }
    }

    private fun validateName(name: String) {
        require(name.length in 1..5) {
            "자동차의 이름은 1글자 이상 5자 이하여야 합니다."
        }
    }

}
