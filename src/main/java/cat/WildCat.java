package cat;

public class WildCat extends Cat implements Playable {
    private String hatePhrase;
    private String saveTheWorldPhrase;
    private String playPhrase;

    public WildCat(String breed, String name, String hatePhrase, String playPhrase, String saveTheWorldPhrase) {
        super(breed, name);
        this.hatePhrase = hatePhrase;
        this.playPhrase =playPhrase;
        this.saveTheWorldPhrase = saveTheWorldPhrase;
    }

    public void hatePeople() {
       log.warn("("+name+ ")  - " + hatePhrase);

    }

    public void saveWorld() {
        log.warn("("+name+ ")  - " + saveTheWorldPhrase);
    }

    @Override
    public void play() {
        log.warn("("+name+ ")  - "+playPhrase);
    }
}
