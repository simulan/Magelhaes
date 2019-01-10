package be.sanderdebleecker.magelhaes.BL

import be.sanderdebleecker.magelhaes.Turns.Base.BaseTurn
import be.sanderdebleecker.magelhaes.Turns.BurningVessel.BurningVesselTurn
import be.sanderdebleecker.magelhaes.Turns.FakeLightHouse.FakeLightHouseTurn
import be.sanderdebleecker.magelhaes.Turns.MysteryRock.MysteryRockTurn
import be.sanderdebleecker.magelhaes.Turns.ReturnCommand.ReturnCommandTurn
import be.sanderdebleecker.magelhaes.Turns.Scorbus.ScorbusTurn
import be.sanderdebleecker.magelhaes.Turns.Start.StartTurn
import be.sanderdebleecker.magelhaes.Turns.Support.SupportTurn
import be.sanderdebleecker.magelhaes.Turns.Victory.VictoryTurn
import java.util.*

/**
 * Created by Sander De Bleecker on 25/12/2018.
 */

class DeckOfTurns {
    private val deck: MutableList<BaseTurn>
    private var index: Int = 0

    init {
        deck = ArrayList()
        deck.add(StartTurn())
        deck.add(ReturnCommandTurn())
        deck.add(ScorbusTurn())
        deck.add(BurningVesselTurn())
        deck.add(SupportTurn())
        deck.add(MysteryRockTurn())
        deck.add(FakeLightHouseTurn())
        deck.add(VictoryTurn())
    }

    fun take(): BaseTurn {
        return deck[index++]
    }


}
