package be.sanderdebleecker.magelhaes.Turns.Scorbus

import be.sanderdebleecker.magelhaes.Turns.Base.BaseTurn
import be.sanderdebleecker.magelhaes.Turns.Base.Decision
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

class ScorbusTurn : BaseTurn() {
    init {
        Scenario = "You're discussing the route in the navigation room until a crewmember enters the room : "+
                "\" Three men have collapsed and are bleeding from their mouth while holding themselves by the stomach out of agony\"."
        Options = listOf(Decision("Throw them aboard before the epidemic spreads further.", ThrowAboardStateChange()),
                Decision("Ask the medic to look at their stomach", ScorbusMedicTurnStateChange()),
                Decision("Give them oranges", StateChange()))
    }
}