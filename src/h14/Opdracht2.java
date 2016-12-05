package h14;

import java.applet.Applet;
import java.awt.*;
import java.util.Random;

/**
 * Created by Burak Sen on 25-11-2016.
 */
public class Opdracht2 extends Applet {


    String[] kleuren = {"Harten", "Ruiten", "Klaver", "Schoppen"};
    String[] kaarten = {"twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "heer", "vrouw", "aas "};

    String kleur, kaart;

    int index, x, y;
    String[] deck, speler1, speler2, speler3, speler4;


    public void init() {
        setSize(1000, 600);
        index = 0;
        deck = new String[52];
        speler1 = new String[13];
        speler2 = new String[13];
        speler3 = new String[13];
        speler4 = new String[13];

        // Kleuren
        for (int i = 0; i < kleuren.length; i++) {
            kleur = kleuren[i];

            // Kaarten
            for (int j = 0; j < kaarten.length; j++) {
                kaart = kaarten[j];

                deck[index] = kleur + " " + kaart;
                index++;
            }
        }

        for (int i = 0; i < 13; i++) {
            speler1[i] = deelKaart();
            speler2[i] = deelKaart();
            speler3[i] = deelKaart();
            speler4[i] = deelKaart();
        }
    }

    public void paint(Graphics g) {
        for (int i = 0; i < 13; i++) {
            g.drawString("Speler 1", 40, 45);
            g.drawString("" + speler1[i], 40, y + 80);

            g.drawString("Speler 2", 200, 45);
            g.drawString("" + speler2[i], 200, y + 80);

            g.drawString("Speler 3", 360, 45);
            g.drawString("" + speler3[i], 360, y + 80);

            g.drawString("Speler 4", 520, 45);
            g.drawString("" + speler4[i], 520, y + 80);
            y += 20;

        }
    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        //vervang de inhoud van deck
        String[] hulpLijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }
}
