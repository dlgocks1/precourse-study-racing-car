package racingcar.domain

import camp.nextstep.edu.missionutils.Randoms.pickUniqueNumbersInRange

class RandomNumberGenerator : NumberGenerator {

    override fun generate(): Int {
        return pickUniqueNumbersInRange(0, 9, 1).first()
    }

}