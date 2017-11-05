package codeclan.com.raysmusicexchange;

/**
 * Created by janemackay on 03/11/2017.
 */

public abstract class Instrument implements Playable {

    protected String name;


    protected InstrumentFamily type;
    protected SoundType soundType;

    public Instrument(String name, InstrumentFamily type, SoundType soundType){
        this.name = name;
        this.type = type;
        this.soundType = soundType;
    }

    public String getName() {
        return name;
    }

    public InstrumentFamily getType() {
        return type;
    }

    public SoundType getSoundType() {
        return soundType;
    }


    public abstract double calculateMarkup();

}
