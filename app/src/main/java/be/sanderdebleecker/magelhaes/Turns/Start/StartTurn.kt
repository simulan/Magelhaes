package be.sanderdebleecker.magelhaes.Turns.Start

import be.sanderdebleecker.magelhaes.Turns.Base.BaseTurn
import be.sanderdebleecker.magelhaes.Turns.Base.Decision
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

/**
 * Created by Sander De Bleecker on 25/12/2018.
 */

class StartTurn : BaseTurn() {
    init {
        Scenario = "Your ship is ready to set sail towards the East but your navigator offers you an alternative route further from the coast to avoid pirates." + "The crew tumults at the hearing of this proposition and demands the resignation of the navigator."
        Options = listOf(Decision("Accept the route further from the coast.", StateChange()),
                Decision("Reject the idea without any commotion.", StateChange()),
                Decision("Refuse angrily relieving the navigator from his duty.", StateChange()))
    }

}
