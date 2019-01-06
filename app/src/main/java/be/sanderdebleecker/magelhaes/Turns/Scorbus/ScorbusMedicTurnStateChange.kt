package be.sanderdebleecker.magelhaes.Turns.Scorbus

import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

class ScorbusMedicTurnStateChange : StateChange() {
    private val CREW_MEMBERS_LOST : Int = 1

    override  fun apply(state: GameState) {
        state.Crew.slice(state.Crew.size-1-CREW_MEMBERS_LOST until state.Crew.size)
    }
}