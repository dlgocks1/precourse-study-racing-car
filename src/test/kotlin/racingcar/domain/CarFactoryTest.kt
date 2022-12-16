package racingcar.domain


import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import racingcar.domain.model.Car

class CarFactoryTest {

    lateinit var carFactory: CarFactory

    @BeforeEach
    fun setUp() {
        carFactory = CarFactory()
    }

    @Test
    fun generateCar() {
        val userInput = "pobi,woni,jun"
        val cars = carFactory.generateCar(userInput)
        userInput.split(",").forEachIndexed { idx, carName ->
            assertThat(cars[idx].getName()).isEqualTo(carName)
        }
    }
}