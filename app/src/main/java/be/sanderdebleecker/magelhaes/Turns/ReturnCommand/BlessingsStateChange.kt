package be.sanderdebleecker.magelhaes.Turns.ReturnCommand

import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

class BlessingsStateChange : StateChange() {
    init {
        explanation = "Blessings are upon you, certainly all this timeloss must amount to something..."
    }

    override fun apply(state: GameState) {
        // todo skip turn in statechange and set karma
    }
}