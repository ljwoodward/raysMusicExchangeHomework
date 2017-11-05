package codeclan.com.raysmusicexchange;

/**
 * Created by janemackay on 03/11/2017.
 */

public abstract class Piano extends Instrument implements Playable {
    protected PianoType pianoType;

    public Piano(String name, InstrumentFamily type, SoundType soundType, PianoType pianoType) {
        super(name, type, soundType);
        this.type = InstrumentFamily.STRING;
        this.pianoType = pianoType;
    }
}
