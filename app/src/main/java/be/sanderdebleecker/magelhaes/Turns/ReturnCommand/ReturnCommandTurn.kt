package be.sanderdebleecker.magelhaes.Turns.ReturnCommand

import be.sanderdebleecker.magelhaes.Turns.Base.BaseTurn
import be.sanderdebleecker.magelhaes.Turns.Base.Decision

class ReturnCommandTurn : BaseTurn() {
    init {
            Scenario = "Several days have already passed by since you have left the port yet another vessel from the same port approaches with " +
                    "royal army units on it and urges you to stop. Once the ship has caught up distance a " +
                    "tall man with a scepter and cape steps forward and shouts : " +
                    "\" I command you in name of the queen to return this vessel to our port. So it can be " +
                    "grazed properly by my blessings so that it will be guided by God's hands.\""
            Options = listOf(Decision("Accept losing days of time.", BlessingsStateChange()),
                    Decision("Shoot the smaller vessel down.", ShootAlliedShipStateChange()),
                    Decision("Arrest him for going against the orders of the mission.", ArrestStateChange()))
    }
}