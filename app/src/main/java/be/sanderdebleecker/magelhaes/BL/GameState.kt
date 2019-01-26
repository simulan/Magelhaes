package be.sanderdebleecker.magelhaes.BL

import be.sanderdebleecker.magelhaes.Models.CrewMember
import java.io.Serializable

/**
 * Created by Sander De Bleecker on 25/12/2018.
 */

class GameState : Serializable {
    var hull = DEFAULT_HULL_VALUE
    var crew = mutableListOf(
    CrewMember("Haby", 4,4),
    CrewMember("Nadia", 2,4),
    CrewMember("Stien", 5,5),
    CrewMember("Caleb", 3,3),
    CrewMember("Micheline", 4,4)
    )
    var captain = CrewMember("Sander", 6,6)
    var playing = true
    var victory = false
    var Turn = 0
    var money = 0
}
