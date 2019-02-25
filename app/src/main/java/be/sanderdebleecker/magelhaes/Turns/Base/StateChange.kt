package be.sanderdebleecker.magelhaes.Turns.Base

import be.sanderdebleecker.magelhaes.BL.GameState
import java.io.Serializable

/**
 * Created by Sander De Bleecker on 25/12/2018.
 */

open class StateChange : Serializable {
    var explanation : String = "Your choice did not go through without consequences : "

    open fun apply(state: GameState) {
        // nothing
    }
}
