package racingcar.domain.model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import racingcar.domain.NumberGenerator

class CarTest {

    @ParameterizedTest
    @ValueSource(strings = ["ABCDEF", "", "ASDASDASDASD"])
    @DisplayName("자동차 이름이 1자 이상 5자 이하인지 테스트한다.")
    fun validateNameLengthTest(name: String) {
        assertThrows<IllegalArgumentException> {
            Car(name)
        }
    }

    @Test
    @DisplayName("자동차가 정상적으로 전진하는지 테스트한다.")
    fun moveTest() {
        val results = listOf(0, 0, 1, 2)
        val numberGenerator = CustomNumberGenerator()
        val testCar = Car("pobi")
        results.forEach { result ->
            testCar.move(numberGenerator)
            assertThat(testCar.getPosition()).isEqualTo(result)
        }
    }

    inner class CustomNumberGenerator : NumberGenerator {
        private val numbers = mutableListOf(1, 2, 4, 5)
        override fun generate(): Int {
            return numbers.removeAt(0)
        }

    }
}