package be.sanderdebleecker.magelhaes.BL


class History {
    private var states: MutableMap<Int, GameState> = mutableMapOf()

    operator fun set(index : Int,addedState: GameState) {
        states[index] = addedState.clone()
    }
    operator fun get(index: Int) : GameState = states[index]!!

    private fun GameState.clone() : GameState {
        val state  = GameState()
        state.Hull = this.Hull
        state.Captain = this.Captain
        state.Crew = this.Crew
        state.Money = this.Money
        state.Playing = this.Playing
        state.Turn = this.Turn
        state.Victory = this.Victory
        return state
    }
}
