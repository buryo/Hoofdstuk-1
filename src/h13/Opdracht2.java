package h13;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Burak Sen on 17-11-2016.
 */
public class Opdracht2 extends Applet {

    public void paint(Graphics g) {
        tekenDriehoek(50, 150, 100, 75, 150);
    }

    void tekenDriehoek(int x1, int y1, int x2, int y2, int x3) {
        getGraphics().drawLine(x1, y1, x2, y2);
        getGraphics().drawLine(x2, y2, x3, y1);
        getGraphics().drawLine(x1, y1, x3, y1);
    }
}
