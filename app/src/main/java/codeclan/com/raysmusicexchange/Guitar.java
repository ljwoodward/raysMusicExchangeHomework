package codeclan.com.raysmusicexchange;

/**
 * Created by janemackay on 03/11/2017.
 */

public abstract class Guitar extends Instrument implements Playable {

    private int numberOfStrings;
    private GuitarType guitarType;

    public Guitar(String name, String material, String colour, InstrumentFamily type, int numberOfStrings, GuitarType guitarType) {
        super(name, material, colour, type);
        this.numberOfStrings = numberOfStrings;
        this.guitarType = guitarType;
    }
}
