package codeclan.com.raysmusicexchange;

/**
 * Created by janemackay on 03/11/2017.
 */

public abstract class Instrument implements Playable {

    private String name;
    private InstrumentFamily type;
    private SoundType elecacoust;

    public Instrument(String name, InstrumentFamily type, SoundType elecacoust){
        this.name = name;
        this.type = type;
        this.elecacoust = elecacoust;
    }
}
