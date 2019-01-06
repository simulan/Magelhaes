package be.sanderdebleecker.magelhaes.Turns.Support

import be.sanderdebleecker.magelhaes.Turns.Base.BaseTurn
import be.sanderdebleecker.magelhaes.Turns.Base.Decision
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

class SupportTurn : BaseTurn() {
    init {
        Scenario = "A vessel sailing by the same flag goes by and offers to help you out. "+
                "Your crew rejoices as the two ships align for entering."
        Options = listOf(Decision("Demand repairs.", RepairStateChange()),
                Decision("Demand a medic.", MedicStateChange()),
                Decision("Nothing to do.", StateChange()))
    }
}