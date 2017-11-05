package codeclan.com.raysmusicexchange;

/**
 * Created by janemackay on 03/11/2017.
 */

public class Guitar extends Instrument implements Playable {

    protected int numberOfStrings;
    protected GuitarType guitarType;
    private String description;
    private double buyPrice;
    private double sellPrice;

    public Guitar(String name, InstrumentFamily type, int numberOfStrings, SoundType soundType,
                  GuitarType guitarType, String description, double buyPrice, double sellPrice) {
        super(name, type, soundType);
        this.type = type;
        this.numberOfStrings = numberOfStrings;
        this.guitarType = guitarType;
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String play() {
        return "There's a lady who's sure...";
    }

    public double calculateMarkup() {
        return this.sellPrice -= this.buyPrice;
    }
}
