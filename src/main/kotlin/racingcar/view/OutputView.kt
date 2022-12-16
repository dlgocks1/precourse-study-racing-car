package racingcar.view

import racingcar.domain.model.Cars
import racingcar.utils.addResults

class OutputView {

    fun result() {
        println("실행 결과")
    }

    fun excutionResults(race: Cars) {
        race.forEach { car ->
            println(car.toString())
        }
        println()
    }

    fun finalWinner(finalWinnder: List<String>) {
        val results = StringBuilder()
        results.append("최종 우승자 : ")
        for (idx in finalWinnder.indices) {
            results.append(finalWinnder[idx])
            if (idx == finalWinnder.size - 1) continue
            results.append(", ")
        }
        println(results.toString())
    }
}