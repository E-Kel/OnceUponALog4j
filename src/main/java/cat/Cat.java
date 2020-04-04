package cat;

import master.Master;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

abstract public class Cat {
    protected final Logger log = LogManager.getLogger(Master.class.getSimpleName());

    protected String breed;
    protected String name;

    public Cat(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void tellphrase(String phrase) {
        log.info("("+name+ ")  - "+phrase);
    }


}


