package be.sanderdebleecker.magelhaes.Controllers

import be.sanderdebleecker.magelhaes.BL.DeckOfTurns
import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.Turns.Base.BaseTurn
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

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
            return null
        }
    }

    fun calculatePlayState() {
        if (state.Victory) {
            playState = PlayState.Victory
        } else {
            if (state.Playing) {
                playState = PlayState.Play
            }else {
                playState = PlayState.Defeat
            }
        }
    }

    fun onDecision(effect: StateChange) : PlayState {
        effect.apply(state)
        calculatePlayState()
        return playState;
    }

    fun onAdvanceTurn() : BaseTurn? {
        return next()
    }
}
