package codeclan.com.raysmusicexchange;

/**
 * Created by janemackay on 04/11/2017.
 */

public class Rickenbacker650s extends Guitar implements Sellable, Playable {


    private String description;
    private double buyPrice;
    private double sellPrice;


    public Rickenbacker650s(String name, InstrumentFamily type, int numberOfStrings, SoundType soundType, GuitarType guitarType) {
        super(name, type, numberOfStrings, soundType, guitarType);
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String play() {
        return "Ba Dum Dum Dum Very Superstitious...";
    }

    public double calculateMarkup() {
        return this.sellPrice -= this.buyPrice;
    }
}
