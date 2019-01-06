package be.sanderdebleecker.magelhaes.Turns.BurningVessel

import be.sanderdebleecker.magelhaes.Turns.Base.BaseTurn
import be.sanderdebleecker.magelhaes.Turns.Base.Decision
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

class BurningVesselTurn : BaseTurn() {
    init {
        Scenario = "Alert, you are awaken by night! The mast shouts reporting a burning vessel sailing under the same flag. "+
                "Their crew seems to be signaling for aid, but  "+
                "approaching the vessel towards it's raising flames seems very difficult."

        Options = listOf(Decision("Ready the crew to extinguish the fires", ExtinguishBurningVesselStateChange()),
                Decision("Order to pass the ship, they are not part of the mission", FleeBurningVesselStateChange()),
                Decision("Demand their crew to jump in the sea and board your ship", StateChange()))
    }
}