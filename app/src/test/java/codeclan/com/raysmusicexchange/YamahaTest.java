package codeclan.com.raysmusicexchange;
import org.junit.Test;
import org.junit.Before;

import static junit.framework.Assert.assertEquals;

/**
 * Created by janemackay on 04/11/2017.
 */

public class YamahaTest {

    private YamahaCX piano1;
    private Piano piano2;
    private Instrument piano3;


    @Before
    public void before() {
        piano1 = new YamahaCX(
                "piano1",
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
        assertEquals("piano1", piano1.getName());
    }

    @Test
    public void testCalculateMarkup(){
        assertEquals(499.99, piano1.calculateMarkup());
    }

}
