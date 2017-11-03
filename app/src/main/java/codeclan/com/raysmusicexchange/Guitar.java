package codeclan.com.raysmusicexchange;

/**
 * Created by janemackay on 03/11/2017.
 */

public abstract class Guitar extends Instrument implements Playable {

    private int numberOfStrings;
    private GuitarType guitarType;

    public Guitar(String name, InstrumentFamily type, int numberOfStrings, SoundType soundType, GuitarType guitarType) {
        super(name, type, soundType);
        this.numberOfStrings = numberOfStrings;
        this.guitarType = guitarType;
    }
}
