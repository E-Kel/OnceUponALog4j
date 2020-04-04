package master;

import narrator.Narrator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static master.Const.MOOD_MAX;

public class Master {

    private String name;
    private int amountOfMoney;
    private int mood;
    private String spoilShoesPhrase;
    private String outOfMoneyPhrase;
    protected final Logger log = LogManager.getLogger(Master.class.getSimpleName());


    public Master(String name, int amountOfMoney, int mood, String spoilShoesPhrase, String outOfMoneyPhrase) {
        this.name = name;
        this.amountOfMoney = amountOfMoney;
        this.mood = mood;
        this.spoilShoesPhrase = spoilShoesPhrase;
        this.outOfMoneyPhrase = outOfMoneyPhrase;
    }

    public void getMood() {
        if (mood < 4) {
            log.fatal("("+name+ ")  - "+ "I'm so Angry!");
        } else if (mood >= 7) {
            log.warn("("+name+ ")  - "+ "I'm so happy! And I'm feeling great\n");
        }
    }

    public String getName() {
        return name;
    }


    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public String getSpoilShoesPhrase() {
        return spoilShoesPhrase;
    }

    public void increaseMood() {
        mood += 2;
        if (mood >= MOOD_MAX) {
            mood = 10;
        }
        getMood();
    }

    public void decreaseAmountOfMoney() {
        amountOfMoney -= 10;
        if (amountOfMoney <= 0) {
            log.fatal("("+name+ ")  - "+outOfMoneyPhrase);
        }
    }
    public void tellphrase(String phrase) {
        log.info("("+name+ ")  - "+phrase);
    }

}
