package be.sanderdebleecker.magelhaes;

import org.junit.Test;

import be.sanderdebleecker.magelhaes.Controllers.GameController;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void playsFirstTurn() throws Exception {
        GameController g = new GameController();
        g.next();
    }


}