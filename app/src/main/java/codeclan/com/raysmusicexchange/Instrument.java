package codeclan.com.raysmusicexchange;

/**
 * Created by janemackay on 03/11/2017.
 */

public abstract class Instrument implements Playable {

    private String name;
    private String material;
    private String colour;
    private InstrumentFamily type;

    public Instrument(String name, String material, String colour, InstrumentFamily type){
        this.name = name;
        this.material = material;
        this.colour = colour;
        this.type = type;
    }
}
