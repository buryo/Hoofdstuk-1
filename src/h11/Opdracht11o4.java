package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Burak Sen on 25-10-2016.
 */
public class Opdracht11o4 extends Applet {

    public void init() {
        setSize(800,150);
    }

    public void paint(Graphics g) {
        int teller = 0, drie=3, uitslag=0;
        int x = 0;

        while(teller < 11) {
            x += 60;
            uitslag = drie * teller;
            g.drawString( drie + "x"+ teller + " = " + uitslag, x, 45 );
            teller++;
        }
    }
}
