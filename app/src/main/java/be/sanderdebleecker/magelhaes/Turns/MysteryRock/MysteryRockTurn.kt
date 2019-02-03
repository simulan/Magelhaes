package be.sanderdebleecker.magelhaes.Turns.MysteryRock

import be.sanderdebleecker.magelhaes.Turns.Base.BaseTurn
import be.sanderdebleecker.magelhaes.Turns.Base.Decision
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

class MysteryRockTurn : BaseTurn() {
    init {
        Scenario = "The vessel sails on as you encounter a big rock surrounded by a low hanging mist, the ship is already in close  "+
                    "proximity to the mysterious rock. A part of the crew demands to avoid the entity but you are intrigued by "+
                    "the colour and texture of the rock, why is their a floating rock in the middle of the ocean?"

        Options = listOf(Decision("turn starboard and avoid it", StateChange()),
                    Decision("Board it and see what's what", MysteryRockBoardStateChange()),
                Decision("Shoot with all cannons towards the rock ", StateChange()))
    }

}