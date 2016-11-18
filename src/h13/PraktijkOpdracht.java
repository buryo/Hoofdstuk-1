package h13;

import sun.plugin2.util.ColorUtil;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Burak Sen on 17-11-2016.
 */
public class PraktijkOpdracht extends Applet {

    Color boomStam;

    public void init() {
        setSize(1200, 800);
        boomStam = new Color(139, 69, 19);
    }

    public void paint(Graphics g) {
        boomTekenen(g, 250, 300);
    }

    void boomTekenen(Graphics g, int x, int y) {
        //Boomstam kleur (bruin)


        for (int j = 0; j < 2; j++) {

            for (int i = 0; i < 5; i++) {

                tekenBoom(g, x, y);

                x += 100;
            }
            y += 100;
            x = 250 + 50;
        }
    }

    void tekenBoom(Graphics g, int x, int y) {

        //Boomstam
        g.setColor(boomStam);
        g.fillRect(x, y, 15, 50);

        //Boomkruin
        g.setColor(Color.green);
        g.fillOval(x - 25, y - 35, 65, 40);
    }

}