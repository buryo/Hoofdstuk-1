package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Burak Sen on 25-10-2016.
 */
public class Oefenen extends Applet{


    public void init() {



    }

    public void paint(Graphics g) {
        int teller = -1;
        int y = 0;

        while(teller < 10) {
            y += 20;
            g.drawLine(50 , y, 300, y );
            teller++;
            g.drawString("" + teller, 305, y );

        }
    }
}
