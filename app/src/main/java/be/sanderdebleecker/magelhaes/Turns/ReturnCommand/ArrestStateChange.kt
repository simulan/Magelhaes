package be.sanderdebleecker.magelhaes.Turns.ReturnCommand

import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.Models.CrewMember
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

class ArrestStateChange : StateChange(){
    init {
        explanation = "Your authority wins your dispute, everybody takes " +
                "your commands for law. The man gets thrown into the isolation chamber."
    }

    override fun apply(state: GameState) {
        state.crew.add(CrewMember("Josephius"))
    }
}
