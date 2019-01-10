package be.sanderdebleecker.magelhaes.Turns.ReturnCommand

import be.sanderdebleecker.magelhaes.BL.CrewMember
import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

class ArrestStateChange : StateChange(){
    override fun apply(state: GameState) {
        state.Crew.add(CrewMember("Josephius"))
    }
}
