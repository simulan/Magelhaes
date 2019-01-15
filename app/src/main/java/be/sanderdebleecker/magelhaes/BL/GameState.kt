package be.sanderdebleecker.magelhaes.BL

import be.sanderdebleecker.magelhaes.Models.CrewMember

/**
 * Created by Sander De Bleecker on 25/12/2018.
 */

class GameState {
    var Hull = DEFAULT_HULL_VALUE
    var Crew = mutableListOf(
    CrewMember("Haby", 4),
    CrewMember("Nadia", 2),
    CrewMember("Stien", 5),
    CrewMember("Caleb", 3),
    CrewMember("Micheline", 4)
    )
    var Captain = CrewMember("Sander", 6)
    var Playing = true
    var Victory = false
    var Turn = 0
    var Money = 0

}
