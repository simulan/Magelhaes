package be.sanderdebleecker.magelhaes.Turns.Support

import be.sanderdebleecker.magelhaes.BL.DEFAULT_HULL_VALUE
import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

class RepairStateChange : StateChange() {
    private val REPAIR_VALUE = 30

    override fun apply(state: GameState) {
        if(state.hull < DEFAULT_HULL_VALUE) {
            state.hull += REPAIR_VALUE
            restrictToMaximumValue(state)
        }
    }
    private fun restrictToMaximumValue(state : GameState) {
        if(state.hull > DEFAULT_HULL_VALUE) {
            state.hull = DEFAULT_HULL_VALUE
        }
    }
}