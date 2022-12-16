package racingcar

import racingcar.controller.RacingCarController
import racingcar.view.InputView
import racingcar.view.OutputView

fun main() {
    try {
        val racingCarController = RacingCarController(
            inputView = InputView(),
            outputView = OutputView()
        )
        racingCarController.racingGame()
    } catch (e: Exception) {
        println(e.message)
    }
}
