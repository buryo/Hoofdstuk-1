package h06;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Burak Sen on 19-9-2016.
 */
public class Opdracht6o2 extends Applet{



    double seconden;
    int uur;
    int dag;
    double jaar;

    public void init() {

        seconden = 60;
        uur = 60;
        dag = 24;
        jaar = 8765.81277;

        uur = (int) seconden * uur;
        dag = (int) seconden * dag;
        jaar = seconden * jaar;


    }

    public void paint(Graphics g) {



        g.drawString(" Seconden " + seconden , 50, 70);
        g.drawString(" Er zitten " + uur + " seconden in een uur ", 50, 90);
        g.drawString(" Er zitten " + dag + " seconden in een dag ", 50, 110);
        g.drawString(" Er zitten " + jaar + " seconden in een jaar ", 50, 130);

    }

}
