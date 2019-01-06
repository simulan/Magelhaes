package be.sanderdebleecker.magelhaes.Views

import be.sanderdebleecker.magelhaes.Turns.Base.StateChange

interface IGameView {
    fun onClickStart()
    fun onAdvanceTurn()
    fun onClickDecision(effect: StateChange)
}
