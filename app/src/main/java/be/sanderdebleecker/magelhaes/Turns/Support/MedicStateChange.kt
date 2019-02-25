package be.sanderdebleecker.magelhaes.Turns.Support

import be.sanderdebleecker.magelhaes.BL.DEFAULT_HEALTH_VALUE
import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

class MedicStateChange : StateChange() {
    init {
        explanation = "A team of medici embark like a swift gust, your entire crew gets threated."
    }

    override fun apply(state: GameState) {
        state.crew.filter { it.health < DEFAULT_HEALTH_VALUE }
            .forEach { it.health = DEFAULT_HEALTH_VALUE }
    }
}
