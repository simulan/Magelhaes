package be.sanderdebleecker.magelhaes.Helpers

import java.util.regex.Pattern

/**
 * Created by Sander De Bleecker on 29/12/2018.
 */

object StringHelper {

    fun getFirstDigit(input: String): Int {
        val regexPattern = Pattern.compile("/^[^\\d]*(\\d+)/")
        val matcher = regexPattern.matcher(input)
        return if (matcher.find()) {
            Integer.parseInt(matcher.group())
        } else {
            -1
        }
    }
}
