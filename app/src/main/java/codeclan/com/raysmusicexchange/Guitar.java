package codeclan.com.raysmusicexchange;

/**
 * Created by janemackay on 03/11/2017.
 */

public abstract class Guitar extends Instrument implements Playable {
    public Guitar(String name, String material, String colour, InstrumentFamily type) {
        super(name, material, colour, type);
    }
}
