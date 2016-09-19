package h06;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Burak Sen on 19-9-2016.
 */
public class Opdracht6o1 extends Applet{



    double totaal;
    double perpersoon;

    int aantalpersonen;


    public void init() {

        aantalpersonen = 4;


        totaal = 113;
        perpersoon = totaal / aantalpersonen;




    }

    public void paint(Graphics g) {

        g.drawString(" Jan €" + perpersoon , 50, 60);
        g.drawString(" Ali €" + perpersoon , 50, 75);
        g.drawString(" Jeannette €" + perpersoon , 50, 90);
        g.drawString(" Burak €" + perpersoon , 50, 105);


    }

}
