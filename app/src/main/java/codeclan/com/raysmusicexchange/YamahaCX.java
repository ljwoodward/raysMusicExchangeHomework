package codeclan.com.raysmusicexchange;

/**
 * Created by janemackay on 03/11/2017.
 */

public class YamahaCX extends Piano implements Sellable, Playable {

    private String description;
    private double buyPrice;
    private double sellPrice;

    public YamahaCX(String name, InstrumentFamily type, SoundType soundType, PianoType pianoType, String description, double buyPrice, double sellPrice) {
        super(name, type, soundType, pianoType);
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String play() {
        return "A wealth of reverberation, taking in the nuances of a player’s intentions and reflecting " +
                "them in the depth and projection of the music itself.";
    }

    public double calculateMarkup() {
        return this.sellPrice -= this.buyPrice;
    }

}