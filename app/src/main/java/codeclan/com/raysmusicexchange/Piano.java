package codeclan.com.raysmusicexchange;

/**
 * Created by janemackay on 03/11/2017.
 */

public abstract class Piano extends Instrument implements Playable {
    private PianoType pianoType;

    public Piano(String name, InstrumentFamily type, SoundType soundType, PianoType pianoType) {
        super(name, type, soundType);
        this.pianoType = pianoType;
    }
}
