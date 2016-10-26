package h11;


import java.applet.Applet;
import java.awt.*;

/**
 * Created by Burak Sen on 25-10-2016.
 */
public class Opdracht11o2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 20;
        int x = 0;

        while(teller >= 10) {
            x += 20;
            g.drawString("" + teller, x, 45 );
            teller--;
        }
    }
}
