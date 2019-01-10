package be.sanderdebleecker.magelhaes.BL

/**
 * Created by Sander De Bleecker on 25/12/2018.
 */

class GameState {
    var Victory = false
    var Playing = true
    var Turn = 0
    var Money = 0
    var Hull = DEFAULT_HULL_VALUE
    var Crew: MutableList<CrewMember> = mutableListOf(
            CrewMember("Haby",4),
            CrewMember("Nadia",2),
            CrewMember("Stien",5),
            CrewMember("Caleb",3),
            CrewMember("Micheline",4)
    )
    var Captain = CrewMember("Sander",6)
}
