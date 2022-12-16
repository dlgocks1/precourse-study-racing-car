package racingcar.view

import racingcar.domain.model.Cars

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

    fun finalWinner() {
        println("최종 우승자 : ")
        // TODO 최종 우승자 출력하기
    }
}