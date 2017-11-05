package codeclan.com.raysmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by janemackay on 04/11/2017.
 */
public class GuitarTest {

    private Guitar guitar1;

    @Before
    public void before() {
        guitar1 = new Guitar("Rickenbacker 650S",
                InstrumentFamily.STRING,
                4,
                SoundType.ELECTRIC,
                GuitarType.BASS,
                "Lovely wooden bass guitar",
                2000.00,
                2899.00)
        ;
    }

    @Test
    public void hasName(){
        assertEquals("Rickenbacker 650S", guitar1.getName());
    }



}