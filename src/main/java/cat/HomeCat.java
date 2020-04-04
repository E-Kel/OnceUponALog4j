package cat;

import master.Master;

public class HomeCat extends Cat implements Playable {

    private Master master;
    private String playPhrase;
    private String spoilShoesPhrase;
    private String layOnSofaPhrase;


    public HomeCat(String breed, String name, Master master, String playPhrase, String spoilShoesPhrase, String layOnSofaPhrase) {
        super(breed, name);
        this.master = master;
        this.playPhrase = playPhrase;
        this.spoilShoesPhrase =spoilShoesPhrase;
        this.layOnSofaPhrase = layOnSofaPhrase;
    }


    public void layOnSofa() {
        master.increaseMood();
        log.warn(name + ": " + layOnSofaPhrase);
    }

    public void spoilShoes() {
        log.warn("("+name+")" + spoilShoesPhrase);
        log.warn("("+ master.getName() + ")  - " + master.getSpoilShoesPhrase());
        master.decreaseAmountOfMoney();
    }

    public Master getMaster() {
        return master;
    }

    public String getPlayPhrase() {
        return playPhrase;
    }

    public String getSpoilShoesPhrase() {
        return spoilShoesPhrase;
    }

    public String getLayOnSofaPhrase() {
        return layOnSofaPhrase;
    }

    @Override
    public void play() {
        log.debug("("+name+ ")  - " + playPhrase);
        master.increaseMood();
    }
}
