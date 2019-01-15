package be.sanderdebleecker.magelhaes.Turns.Base

import be.sanderdebleecker.magelhaes.BL.GameState
import java.io.Serializable

/**
 * Created by Sander De Bleecker on 25/12/2018.
 */

open class StateChange : Serializable {

    open fun apply(state: GameState) {
        // nothing
    }
}
