package be.sanderdebleecker.magelhaes.Turns.Base

import be.sanderdebleecker.magelhaes.BL.GameState
import be.sanderdebleecker.magelhaes.Helpers.StringHelper
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.io.Serializable

/**
 * Created by Sander De Bleecker on 29/12/2018.
 */

open class BaseTurn() : Turn(), Serializable {
    private var br: BufferedReader? = null

    override fun play(state: GameState) {
        println(this)
        val response = demandResponse()
        response.Consequence.apply(state)
    }

    private fun demandResponse(): Decision {
        br = BufferedReader(InputStreamReader(System.`in`))
        var enteredDigit = -1
        try {
            val response = br!!.readLine()
            enteredDigit = StringHelper.getFirstDigit(response)
            br!!.close()
        } catch (ignored: IOException) {
        }

        return Options[enteredDigit]
    }
    override fun toString(): String {
        return super.toString()
    }
}
