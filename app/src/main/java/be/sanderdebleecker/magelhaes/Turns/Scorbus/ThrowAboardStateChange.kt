package be.sanderdebleecker.magelhaes.Turns.Scorbus

import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

class ThrowAboardStateChange : StateChange() {
    private val CREW_MEMBERS_LOST : Int = 3
    init {
        explanation = "The men are thrown aboard, sharks fed and your men are safe from contamination."
    }

    override  fun apply(state: GameState) {
        state.crew.slice(state.crew.size-1-CREW_MEMBERS_LOST until state.crew.size)
    }
}