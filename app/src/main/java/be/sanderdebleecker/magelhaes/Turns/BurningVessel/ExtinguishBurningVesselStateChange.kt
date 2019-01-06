package be.sanderdebleecker.magelhaes.Turns.BurningVessel

import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

class ExtinguishBurningVesselStateChange : StateChange() {


    override fun apply(state: GameState) {
        state.Hull -= 5
    }
}