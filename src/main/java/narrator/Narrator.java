package narrator;

import cat.HomeCat;
import master.Master;
import cat.WildCat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Narrator {
    private static final Logger log = LogManager.getLogger(Class.class.getName());


    public void tellphrase(String phrase) {
        log.info(phrase);
    }

    public void intro() {
        log.info("hello world!!!!!!!!!!!!!!!!!!!!!!!!!");
        tellphrase("\nA long time ago in a galaxy far, far away... \n" +
                "Rebel spaceships, striking\n" +
                "from a hidden base, have won\n" +
                "their first victory against\n" +
                "the evil Galactic Empire.\n" +
                "\n" +
                "During the battle, Rebel\n" +
                "spies managed to steal secret\n" +
                "plans to the Empire's\n" +
                "ultimate weapon, the DEATH\n" +
                "STAR, an armored space\n" +
                "station with enough power to\n" +
                "destroy an entire planet.\n" +
                "\n" +
                "Pursued by the Empire's\n" +
                "sinister agents, Princess\n" +
                "Leia races home aboard her\n" +
                "starship, custodian of the\n" +
                "stolen plans that can save\n" +
                "her people and restore\n" +
                "freedom to the galaxy....." +
                "\n\n");

    }
    public void DartWaderAndPalpatine(Master palpatine, HomeCat DW) {
        log.info("\n===Chapter 1===\n(Emperor's flagship)\n");
        DW.layOnSofa();
        DW.play();
        palpatine.tellphrase( "Come to me, my little kitty, I have a mission for you.");
        DW.spoilShoes();
        palpatine.tellphrase( "Stop it! I want to tell you something. Come here!");
        DW.tellphrase("{Comming up to Palpatine}");
        palpatine.tellphrase( "So, I need you to find plans of DEATH STAR at the Rebel Planet.\n " +
                " Our spy have sent the message that they are hidden at the Tatuin. \n " +
                "I want you to destroy a Rebel base and bring back the plans. \n " +
                "If you succeed, I'll teach you how to create thunders.\n " +
                "If not ... You will regret about that! Understood? ");
        tellphrase("Meow! {xooooo-khhhhhhhh}");

    }

    public void LukeAndYoda(Master yoda, WildCat luke) {
        log.info("===Chapter 2===\n(Tatuin)\n");
        tellphrase("There was a good wild cat named Luke Skywalker that lived on the planet Tatuin." +
                "\nThere was a usual morning in Luke's village. But suddenly, he have heard that somebody in the yard. ");
        luke.hatePeople();
        luke.tellphrase("Who is there? ");
        tellphrase("There was Master Yoda, legendary Jedi Master ");
        yoda.tellphrase("Hello, my young padawan!\n " +
                "That force is flowing in you I feel. Yrssss.... \n " +
                "With me come to Alderaan. Hrshhhh...\n " +
                "I can teach you, and maybe a Jedi you'll become and fight with sith you will!\n " +
                "Or even you can learn testing and java and become an Automation QA Engineer and save the world!\n " +
                "What your answer will be? Yrsss..");
        luke.saveWorld();
        yoda.tellphrase("Good young padawan! ");
        tellphrase("...Both set out to Alderaan...\n" +
                "=3 years later= \n" +
                "#STUDYwasHARD \n " +
                "Luke was the last Jedi that has been trained by Master Yoda\n" +
                "When his training came to an end Green Master call Luke and said: ");
        while (yoda.getAmountOfMoney()>0) {
            yoda.decreaseAmountOfMoney();
        }
        tellphrase("Then Luke has got the assignment to a secret mission...");
    }

    public void DartWaderMeetLukeAndKillPalpatine(WildCat luke, HomeCat DW) {
        log.info("===Chapter 3===\n(Somewhere in the space)\n\n ");
        tellphrase("Darth Wader hasn't gone to Tatuin.\n " +
                "He knew that Luke, his son is living there, so he tricked Palatine,\n " +
                "destroy half of Imperial fleet and continue to spoiling shoes of his Master\n ");
        while (DW.getMaster().getAmountOfMoney() > 20)
            DW.spoilShoes();
        log.info("=3 years later= \n");
        tellphrase("Luke was captured during the mission. After a while, he had been brought to Darth Wader");
        DW.tellphrase("Luke, I'm your father!");
        luke.tellphrase("NOOOOOO, It's Impossible!!!");
        DW.tellphrase("So, first of all, I'll kill Palpatine, then we will rule the galaxy.");
        luke.tellphrase("Ok, but how are you gonna do tha...");
        DW.spoilShoes();
        DW.spoilShoes();
        tellphrase("The End!");

    }
}
