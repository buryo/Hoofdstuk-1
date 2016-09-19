package h06;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Burak Sen on 19-9-2016.
 */
public class Opdracht6o3 extends Applet{



    int positievegetal;
    int positievegetal2;
    int negativegetal;


    public void init() {

        positievegetal = 999990000;
        positievegetal2 = 999900000;

        negativegetal = positievegetal * positievegetal2;


    }

    public void paint(Graphics g) {



        g.drawString(" Negative getal = " + negativegetal , 50, 70);


    }

}
