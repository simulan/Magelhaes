package be.sanderdebleecker.magelhaes.Turns.MysteryRock

import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.Models.CrewMember
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

class MysteryRockBoardStateChange : StateChange() {
    init {
        explanation = "Your crew attempts to board but before they reach even close " +
                "there is a reaction from the other side. Through the mist you see red eyes" +
                "and pale skins they step towards your men. Seems like they would like to join..."
    }

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