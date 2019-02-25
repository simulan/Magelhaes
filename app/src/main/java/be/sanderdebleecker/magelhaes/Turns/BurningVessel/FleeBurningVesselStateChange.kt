package be.sanderdebleecker.magelhaes.Turns.BurningVessel

import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

class FleeBurningVesselStateChange : StateChange() {
    private val CREW_MEMBERS_LOST : Int = 1
    init {
        explanation = "An hour hasn't even passed by and it seems the burning ship has " +
                "caught up, iron tears through the sky and you take heavy fire. " +
                "Your men get the better of them but at a cost."
    }

    override fun apply(state: GameState) {
        state.crew.slice(state.crew.size-1-CREW_MEMBERS_LOST until state.crew.size)
        state.vessel.health -= 60
    }
}