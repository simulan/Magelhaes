package be.sanderdebleecker.magelhaes.Turns.Support

import be.sanderdebleecker.magelhaes.BL.DEFAULT_HEALTH_VALUE
import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

class MedicStateChange : StateChange() {
    override fun apply(state: GameState) {
        state.crew.filter { it.health < DEFAULT_HEALTH_VALUE }
            .forEach { it.health = DEFAULT_HEALTH_VALUE }
    }
}
