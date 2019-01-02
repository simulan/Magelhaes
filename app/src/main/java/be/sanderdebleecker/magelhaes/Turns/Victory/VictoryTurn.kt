package be.sanderdebleecker.magelhaes.Turns.Victory

import be.sanderdebleecker.magelhaes.Turns.Base.BaseTurn
import be.sanderdebleecker.magelhaes.Turns.Base.Decision

/**
 * Created by Sander De Bleecker on 29/12/2018.
 */

class VictoryTurn : BaseTurn() {
    init {
        Scenario = "You see land... it looks very familiar... it seems like home. You have finally arrived home after what felt a lifetime everybody rejoices at the sight of the port. " + "The vessel reaches entry with the hometown ecstatic and in tears, eagerly welcoming back their champions from a long trip away."
        Options = listOf(Decision("Continue...", VictoryStateChange()))
    }
}
