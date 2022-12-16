package racingcar.domain.model

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class CarTest {

    @ParameterizedTest
    @ValueSource(strings = ["ABCDEF", "", "ASDASDASDASD"])
    @DisplayName("자동차 이름이 1자 이상 5자 이하인지 테스트한다.")
    fun validateNameLength(name: String) {
        assertThrows<IllegalArgumentException> {
            Car(name)
        }
    }
}