package be.sanderdebleecker.magelhaes.BL


class History {
    private var states: MutableMap<Int, GameState> = mutableMapOf()

    operator fun set(index : Int,addedState: GameState) {
        states[index] = addedState.clone()
    }
    operator fun get(index: Int) : GameState = states[index]!!

    private fun GameState.clone() : GameState {
        val state  = GameState()
        state.vessel = this.vessel
        state.captain = this.captain
        state.crew = this.crew
        state.money = this.money
        state.playing = this.playing
        state.turn = this.turn
        state.victory = this.victory
        return state
    }
}
