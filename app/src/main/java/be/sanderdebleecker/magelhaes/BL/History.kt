package be.sanderdebleecker.magelhaes.BL


class History {
    private var states: MutableList<GameState> = mutableListOf()

    operator fun set(index: Int, addedState: GameState) {
        states[index] = addedState
    }
    operator fun get(index: Int) = states[index]

}