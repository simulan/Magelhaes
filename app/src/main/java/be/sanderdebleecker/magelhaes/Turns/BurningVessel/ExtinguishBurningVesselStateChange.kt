package be.sanderdebleecker.magelhaes.Turns.BurningVessel

import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

class ExtinguishBurningVesselStateChange : StateChange() {
    init {
        explanation = "You approach and your vessel takes fire, yet your men " +
                "respond accordingly."
    }

    override fun apply(state: GameState) {
        state.vessel.health -= 5
    }
}