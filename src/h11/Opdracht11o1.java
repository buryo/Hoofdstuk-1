package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Burak Sen on 25-10-2016.
 */
public class Opdracht11o1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 0;
        int x = 0;

        while(teller < 10) {
            teller++;
            x += 20;
            g.drawLine(x, 50, x, 300 );
            g.drawString("" + teller, x-3, 45 );
        }
    }
}
