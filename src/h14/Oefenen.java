package h14;

import java.applet.Applet;

/**
 * Created by Burak Sen on 18-11-2016.
 */
import java.awt.*;

public class Oefenen extends Applet {

//    String [] kleuren = {"Harten", "Ruiten", "Klaver", "Schoppen"};
//    String [] puntKaarten = {"twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "heer", "vrouw", "aas "};
//    String [] speler1 , speler2, speler3, speler4;

//    String kleur, puntKaart;

    double random;
    int[] worp;

    public void init() {

        worp = new int[13];

        for (int i = 0; i < worp.length; i++) {

            random = Math.random();
            worp[i] = (int) (random * worp.length);


        }
    }

    public void paint(Graphics g) {
        int y = 20;

        for (int i = 0; i < worp.length; i++) {
            g.drawString("" + worp[i], 20, y);
            y += 20;
        }

    }
}
