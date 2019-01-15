package be.sanderdebleecker.magelhaes

import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.BL.History
import be.sanderdebleecker.magelhaes.Controllers.GameController
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
class ExampleUnitTest {
    @Test
    @Throws(Exception::class)
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    @Throws(Exception::class)
    fun playsFirstTurn() {
        val g = GameController()
        g.next()
    }

    @Test
    fun setAndGetHistory() {
        var h = History()
        h[0] = GameState()
        assertNotNull(h[0])
    }

}