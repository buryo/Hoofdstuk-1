package h13;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Burak Sen on 17-11-2016.
 */
public class Opdracht3 extends Applet {
    public void init() {
        setSize(1400, 600);
    }

    public void paint(Graphics g) {
        tekenMuur(g, 82, 100, 80, 30);
    }

    void tekenMuur(Graphics g, int x, int y, int breedte, int hoogte) {

        Color kleur = Color.red;
        g.setColor(kleur);

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 13; j++) {
                g.fillRect(x * j + 45 * (i % 2), y, breedte, hoogte);

            }
            y += hoogte + 2;

        }
    }
}
