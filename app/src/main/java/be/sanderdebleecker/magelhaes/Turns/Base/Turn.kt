package be.sanderdebleecker.magelhaes.Turns.Base

import be.sanderdebleecker.magelhaes.BL.GameState

/**
 * Created by Sander De Bleecker on 25/12/2018.
 */

abstract class Turn {
    // todo code more elegantly
    // todo make consequences change by RNG %
    var Options: List<Decision> = listOf<Decision>()
    var Scenario = ""

    abstract fun play(state: GameState)

    override fun toString(): String {
        var output = Scenario
        for (d in Options) {
            output += "\n\r" + d.Text
        }
        return output
    }
}
