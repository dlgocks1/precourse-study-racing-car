package racingcar.domain

import camp.nextstep.edu.missionutils.Randoms.pickUniqueNumbersInRange

class RandomNumberGenerator : NumberGenerator {

    override fun generate(): Int {
        return pickUniqueNumbersInRange(MINIMUN_RANDOM_NUMBER, MAXIMUN_RANDOM_NUMBER, RANDOM_NUMBER_COUNT).first()
    }

    companion object {
        const val MINIMUN_RANDOM_NUMBER = 0
        const val MAXIMUN_RANDOM_NUMBER = 9
        const val RANDOM_NUMBER_COUNT = 1
    }
}