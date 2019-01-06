package be.sanderdebleecker.magelhaes.Turns.MysteryRock

import be.sanderdebleecker.magelhaes.BL.CrewMember
import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

class MysteryRockBoardStateChange : StateChange() {
    private val norseCrew = listOf(
            CrewMember("Hjarna", 6),
            CrewMember("Korzo", Health = 4),
            CrewMember("Volsjen", Health = 4),
            CrewMember("Ragnar", Health = 4),
            CrewMember("Lohu", Health = 4)
    )

    override fun apply(state: GameState) {
        state.Crew.addAll(norseCrew)
    }
}