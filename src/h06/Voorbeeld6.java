package h06;

//Voorbeeld 6.1

import java.awt.*;
import java.applet.*;


public class Voorbeeld6 extends Applet {
    int teller;

    public void init() {
        teller = 0;
    }

    public void paint(Graphics g) {
        teller++;
        g.drawString("Scherm is " + teller + " keer ververst.", 50, 60);
    }

}