package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Burak Sen on 25-10-2016.
 */
public class Opdracht11o5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller = 0;
        int x=0,y=0;

        while(teller < 5) {
            teller++;
            x += 25;
            y += 25;
            g.drawRect(x,y,25,25);
        }
    }
}
