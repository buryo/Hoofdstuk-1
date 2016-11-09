package h12;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Burak Sen on 2-11-2016.
 */
public class Opdracht2 extends Applet {

    Button[] knoppen;


    public void init() {
        knoppen = new Button[25];

        for (int teller = 0; teller < knoppen.length; teller++) {
            knoppen[teller] = new Button("Knop " + (teller + 1));

            add(knoppen[teller]);
        }
    }
}




