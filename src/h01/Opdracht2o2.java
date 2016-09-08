package h01;

import java.applet.Applet;
import java.awt.*;



public class Opdracht2o2 extends Applet {

    public void init() {

        setBackground(Color.white);
    }

    public void paint(Graphics g) {

        g.setColor(Color.blue);
        g.drawString("Burak", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Sen", 50, 80);
    }

}