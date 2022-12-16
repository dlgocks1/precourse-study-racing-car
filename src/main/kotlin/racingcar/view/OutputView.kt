package racingcar.view

import racingcar.domain.model.Cars
import racingcar.utils.Message.OUPUT_RESULT
import racingcar.utils.Message.OUTPUT_FINAL_WINNER
import racingcar.utils.SEPARATED_COMMA

class OutputView {

    fun result() {
        println(OUPUT_RESULT)
    }

    fun excutionResults(race: Cars) {
        race.forEach { car ->
            println(car.toString())
        }
        println()
    }

    fun finalWinner(finalWinnder: List<String>) {
        val results = StringBuilder()
        results.append(OUTPUT_FINAL_WINNER)
        for (idx in finalWinnder.indices) {
            results.append(finalWinnder[idx])
            if (idx == finalWinnder.size - 1) continue
            results.append(SEPARATED_COMMA)
        }
        println(results.toString())
    }
}