package be.sanderdebleecker.magelhaes.Turns.FakeLightHouse

import be.sanderdebleecker.magelhaes.Turns.Base.BaseTurn
import be.sanderdebleecker.magelhaes.Turns.Base.Decision
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

// Idea : character select , painting where
// character comes out of the painting animation is played
// e.g. characters Vikings, Marco Polo , Magelhaes, Known Conquistadors, Templars

class FakeLightHouseTurn : BaseTurn() {
    init {
        Scenario = "Leaving the European quarter of your trip through a thick mist, there appears to be a light coming from a tower "+
                "although there are no indications of a nearby lighthouse on the local map. "
        Options = listOf(Decision("Pass the light without further action.", StateChange()),
                Decision("Try to embark in proximity of the lighthouse.", StateChange()))
    }
}