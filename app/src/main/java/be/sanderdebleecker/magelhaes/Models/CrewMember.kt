package be.sanderdebleecker.magelhaes.Models

/**
 * Created by Sander De Bleecker on 25/12/2018.
 */

class CrewMember(var name: String = "Haido", health: Int = 4, var maxHealth: Int = 4) {
    var health: Int = health
        set(value) {
            if (value > maxHealth)
                field = maxHealth
            else
                field = value
        }
}
