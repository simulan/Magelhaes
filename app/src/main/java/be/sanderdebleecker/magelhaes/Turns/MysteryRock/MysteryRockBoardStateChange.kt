package be.sanderdebleecker.magelhaes.Turns.MysteryRock

import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.Models.CrewMember
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

class MysteryRockBoardStateChange : StateChange() {
    private val norseCrew = listOf(
            CrewMember("Hjarna", 6),
            CrewMember("Korzo", health = 4),
            CrewMember("Volsjen", health = 4),
            CrewMember("Ragnar", health = 4),
            CrewMember("Lohu", health = 4)
    )

    override fun apply(state: GameState) {
        state.crew.addAll(norseCrew)
    }
}