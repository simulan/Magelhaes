package be.sanderdebleecker.magelhaes.Controllers

import be.sanderdebleecker.magelhaes.BL.DeckOfTurns
import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.Turns.Base.BaseTurn

/**
 * Created by Sander De Bleecker on 25/12/2018.
 */

class GameController {
    //todo put in a load method
    private val state = GameState()
    private val deck = DeckOfTurns()
    var playState = PlayState.Play

    enum class PlayState {
        Play,Defeat,Victory
    }

    fun next() : BaseTurn? {
        if (state.Playing && !state.Victory) {
            state.Turn++
            return deck.take()
        }else{
            if (state.Victory) {
                playState = PlayState.Victory
            } else {
                playState = PlayState.Defeat
            }
            return null
        }
    }

    fun onAdvanceTurn() : BaseTurn? {
        return next()
    }
}
