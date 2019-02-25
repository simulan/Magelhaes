package be.sanderdebleecker.magelhaes.Turns.Victory

import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

/**
 * Created by Sander De Bleecker on 29/12/2018.
 */

class VictoryStateChange : StateChange() {
    init{
        explanation = "You've won!"
    }

    override fun apply(state: GameState) {
        state.victory = true
    }
}
