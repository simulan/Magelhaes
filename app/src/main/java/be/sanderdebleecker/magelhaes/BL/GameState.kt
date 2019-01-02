package be.sanderdebleecker.magelhaes.BL

import java.util.*

/**
 * Created by Sander De Bleecker on 25/12/2018.
 */

class GameState {
    var Victory = false
    var Playing = true
    var Turn = 0
    var Crew: List<CrewMember> = ArrayList()
    var Captain = CrewMember()
}
