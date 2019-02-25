package be.sanderdebleecker.magelhaes.Turns.ReturnCommand

import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

class ShootAlliedShipStateChange : StateChange() {
    init {
        explanation = "The ship gets shot down to debris without any redo, and then silence..."
    }

    override fun apply(state: GameState) {
        //todo set futur implications: bad karma
    }
}