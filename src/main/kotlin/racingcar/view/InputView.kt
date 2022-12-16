package racingcar.view

import camp.nextstep.edu.missionutils.Console
import java.lang.IllegalArgumentException

class InputView {

    fun carNames(): String {
        println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
        return Console.readLine()
    }

    fun attempsNumber(): Int {
        println("시도할 회수는 몇회인가요?")
        return Console.readLine().toIntOrNull() ?: throw IllegalArgumentException("시도 횟수는 1이상의 정수로 입력해주세요.")
    }
    
}