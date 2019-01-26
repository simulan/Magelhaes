package be.sanderdebleecker.magelhaes

import be.sanderdebleecker.magelhaes.Controllers.GameController

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GameUT {

    @Test
    @Throws(Exception::class)
    fun playsFirstTurn() {
        val g = GameController()
        g.next()
    }
}