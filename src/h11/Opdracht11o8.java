package h11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Burak Sen on 25-10-2016.
 */
public class Opdracht11o8 extends Applet {

    public void init() {
        setSize(500,800);
    }


    public void paint(Graphics g) {
        int teller = 0;
        int x=0,y=0,a=50,b=50;

        while(teller < 100) {
            teller++;
            x += 6;
            y += 6;
            a -= 0;
            b -= 0;
            g.drawOval(a,b,x,y);
        }
    }
}
