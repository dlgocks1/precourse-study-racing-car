package racingcar.controller

import racingcar.domain.RacingManagement
import racingcar.view.InputView
import racingcar.view.OutputView

class racingCarController(
    private val inputView: InputView,
    private val outputView: OutputView
) {

    private val racingManagement = RacingManagement()

    fun racingGame() {
        setCars()
        setAttemps()
        stratRacing()
        finalWinner()
    }

    private fun finalWinner() {
        outputView.finalWinner(racingManagement.finalWinnder())
    }

    private fun stratRacing() {
        outputView.result()
        with(racingManagement) {
            while (isEnded()) {
                outputView.excutionResults(race())
            }
        }
    }


    private fun setAttemps() {
        racingManagement.setAttemps(inputView.attempsNumber())
    }

    private fun setCars() {
        racingManagement.setCars(inputView.carNames())
    }

}