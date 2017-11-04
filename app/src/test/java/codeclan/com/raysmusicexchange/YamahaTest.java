package codeclan.com.raysmusicexchange;
import org.junit.Test;
import org.junit.Before;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by janemackay on 04/11/2017.
 */

public class YamahaTest {

    YamahaCX yamaha;

    @Before
    public void before() {
        yamaha = new YamahaCX(
                "newYamaha",
                InstrumentFamily.KEYBOARD,
                SoundType.ACCOUSTIC,
                PianoType.BABYGRAND,
                "Crisp attack. Sparkling tone. Clean harmonies. This is the birth of a new " +
                        "series of grand pianos that builds on the legacy of Yamaha’s CFX concert grand piano.",
                1500.00,
                1999.99);
    }

    @Test
    public void hasName(){
        assertEquals("newYamaha", yamaha.getName());
    }

    @Test
    public void testCalculateMarkup(){
        assertEquals(499.99, yamaha.calculateMarkup());
    }
}
