package be.sanderdebleecker.magelhaes.Controllers

import be.sanderdebleecker.magelhaes.BL.DeckOfTurns
import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.BL.History
import be.sanderdebleecker.magelhaes.Turns.Base.BaseTurn
import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

/**
 * Created by Sander De Bleecker on 25/12/2018.
 */

class GameController {
    //todo put in a load method
    private val state = GameState()
    private val deck = DeckOfTurns()
    private val history = History()

    init {
        history[state.Turn] = state
    }

    var playState = PlayState.Play

    enum class PlayState {
        Play,Defeat,Victory
    }

    fun next() : BaseTurn? {
        if (state.playing && !state.victory) {
            state.Turn++
            return deck.take()
        }else{
            return null
        }
    }

    fun calculatePlayState() {
        if (state.victory) {
            playState = PlayState.Victory
        } else {
            if (state.playing) {
                playState = PlayState.Play
            }else {
                playState = PlayState.Defeat
            }
        }
    }
    /**
    * Event that gets called by the view after a decision was indicated for the current turn ,
     *  @@param effect a StateChange object representing the changement of the game state
     *  @@return PlayState to indicate if the game is over, won or still going on.
    **/
    fun onDecision(effect: StateChange) : PlayState {
        effect.apply(state)
        history[state.Turn]=state

        calculatePlayState()
        return playState;
    }

    /**
     * Event that gets called by the view to continue to the next turn , after showing the result's of the previous turn
     */
    fun onAdvanceTurn() : BaseTurn? {
        return next()
    }

    fun getStatus() : GameState = state
}
