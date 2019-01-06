package be.sanderdebleecker.magelhaes.Turns.BurningVessel

import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

class FleeBurningVesselStateChange : StateChange() {
    private val CREW_MEMBERS_LOST : Int = 1


    override fun apply(state: GameState) {
        state.Crew.slice(state.Crew.size-1-CREW_MEMBERS_LOST until state.Crew.size)
        state.Hull -= 60
    }
}