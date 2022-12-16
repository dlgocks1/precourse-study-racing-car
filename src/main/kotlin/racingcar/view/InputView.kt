package racingcar.view

import camp.nextstep.edu.missionutils.Console
import racingcar.utils.ERROR.ATTEMPS_SIZE
import racingcar.utils.Message.INPUT_ATTEMPS
import racingcar.utils.Message.INPUT_CAR_NAME
import java.lang.IllegalArgumentException

class InputView {

    fun carNames(): String {
        println(INPUT_CAR_NAME)
        return Console.readLine()
    }

    fun attempsNumber(): Int {
        println(INPUT_ATTEMPS)
        return Console.readLine().toIntOrNull() ?: throw IllegalArgumentException(ATTEMPS_SIZE)
    }

}