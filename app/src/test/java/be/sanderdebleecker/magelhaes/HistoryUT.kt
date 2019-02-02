package be.sanderdebleecker.magelhaes

import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.BL.History
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class HistoryUT {

    @Test
    fun setAndGetHistory() {
        val history = History()
        history[0] = GameState()
        assertNotNull(history[0])
    }

    @Test
    fun getAllStatesFromHistory() {
        val history = History()

        // simulation of turns
        val s0 = GameState()
        val s1 = GameState()
        val s2 = GameState()
        s1.vessel -= s1.vessel / 2
        s1.Turn = 1
        s2.vessel = s1.vessel
        s2.Turn = 2

        history[0] = s0
        history[1] = s1
        history[2] = s2

        assertNotNull(history[0])
        assertNotNull(history[1])
        assertNotNull(history[2])

        assertEquals(s0.Turn,0)
        assertEquals(s1.Turn,1)
        assertEquals(s2.Turn,2)
        assertEquals(s1.vessel,s0.vessel /2 )
    }

    // test to check if a saved state doesn't change by reference
    @Test
    fun setStateWithoutChangesByRef() {
        val h = History()
        val state = GameState()
        val hullAfterTurn0: Int
        val hullAfterTurn1: Int
        val hullAfterTurn2: Int
        val delta = state.vessel / 8

        // turn 0
        state.vessel -= delta
        hullAfterTurn0 = state.vessel
        h[0] = state

        // turn 1
        state.vessel -= delta
        hullAfterTurn1 = state.vessel
        h[1] = state

        // turn 2
        state.vessel -= delta
        hullAfterTurn2 = state.vessel
        h[2] = state

        assertEquals(hullAfterTurn0,h[0].vessel)
        assertEquals(hullAfterTurn1,h[1].vessel)
        assertEquals(hullAfterTurn2,h[2].vessel)
    }
}