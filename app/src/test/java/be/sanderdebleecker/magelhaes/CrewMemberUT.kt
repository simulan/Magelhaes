package be.sanderdebleecker.magelhaes

import be.sanderdebleecker.magelhaes.Models.CrewMember
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CrewMemberUT {

    /*
    *   Setting health wil never exceed maximum health
     */
    @Test
    @Throws(Exception::class)
    fun setHealthAboveMaxHealth() {
        val maxHealth = 4
        val healthAboveMax = 5
        val c = CrewMember("Jully",maxHealth,maxHealth)
        c.health = healthAboveMax
        assertEquals(maxHealth,c.health)
    }

    /*
    *   Setting initial health above maximum health is allowed
     */
    @Test
    @Throws(Exception::class)
    fun setInitialHealthAboveMaxHealth() {
        val maxHealth = 4
        val healthAboveMax = 5
        val c = CrewMember("Jully",healthAboveMax,maxHealth)
        assertEquals(healthAboveMax,c.health)
    }
}