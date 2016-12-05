package h14;

import java.applet.Applet;

/**
 * Created by Burak Sen on 18-11-2016.
 */
import java.awt.*;

public class Opdracht1 extends Applet {

    String[] kleuren = {"Harten", "Ruiten", "Klaver", "Schoppen"};
    String[] puntKaarten = {"twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "heer", "vrouw", "aas"};
    String kleur, puntKaart;
    double random, random2;
    int worp, worp2;

    public void init() {
        // Hier maak ik het random.
        random = Math.random();
        random2 = Math.random();

        // hier wordt de double random naar int gezet, zodat het een heel getal is.
        worp = (int) (random * kleuren.length);
        worp2 = (int) (random2 * puntKaarten.length);

        // Hier geef ik aan dat worp (random getal) uit de array van kleuren & puntKaarten moet halen.
        kleur = kleuren[worp];
        puntKaart = puntKaarten[worp2];

    }

    public void paint(Graphics g) {
        g.drawString("" + kleur + " " + puntKaart, 20, 20);
    }
}