package org.gavr.model

import org.gavr.MAX_INDEX
import java.lang.IllegalArgumentException

/**
 * @author : daniil.mironov
 * Created : 14.03.2021
 **/
class Position(val index: Int) {
    init {
        if (index < 0 || index > MAX_INDEX) {
            throw IllegalArgumentException("Position index must be in interval from 0 to $MAX_INDEX")
        }
    }
}
