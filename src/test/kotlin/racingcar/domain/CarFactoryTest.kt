package racingcar.domain


import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import racingcar.domain.model.Car

class CarFactoryTest {

    lateinit var carFactory: CarFactory

    @BeforeEach
    fun setUp() {
        carFactory = CarFactory()
    }

    @Test
    @DisplayName("올바른 이름을 가진 자동차를 생성하는지 테스트 한다.")
    fun generateCarTest() {
        val userInput = "pobi,woni,jun"
        val cars = carFactory.generateCar(userInput)
        userInput.split(",").forEachIndexed { idx, carName ->
            assertThat(cars[idx].getName()).isEqualTo(carName)
        }
    }
}