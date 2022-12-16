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
        println("최종 우승자 : ")
        val results = StringBuilder()
        for (idx in 1..finalWinnder.size) {
            results.append(finalWinnder[idx])
            if (idx == finalWinnder.size) continue
            results.append(", ")
        }
    }
}