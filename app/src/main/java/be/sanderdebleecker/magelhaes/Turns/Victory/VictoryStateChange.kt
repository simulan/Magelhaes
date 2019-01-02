package be.sanderdebleecker.magelhaes.Turns.Victory

import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

/**
 * Created by Sander De Bleecker on 29/12/2018.
 */

class VictoryStateChange : StateChange() {
    override fun apply(state: GameState) {
        state.Victory = true
    }
}
