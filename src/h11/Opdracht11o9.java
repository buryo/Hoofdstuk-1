package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11o9 extends Applet {
    Color kleur1, kleur2;

    public void init() {
        setSize(400, 400);
    }

    public void paint(Graphics g) {
        setBackground(Color.CYAN);
        int y = 50, x=50;
        int breedte = 35, hoogte = 35, rij = 0, kolom = 0;
        kleur1 = Color.black;
        kleur2 = Color.WHITE;

        while (kolom < 8) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                kleur1 = Color.black;
                kleur2 = Color.white;
            } else {
                kleur1 = Color.white;
                kleur2 = Color.black;
            }
            for (rij = 0; rij < 8; rij++) {
                if (rij == 0 || rij == 2 || rij == 4 || rij == 6) {
                    g.setColor(kleur1);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(kleur2);
                    g.fillRect(x, y, breedte, hoogte);
                }
                y += hoogte;
            }
            y = 50;
            x += breedte;
            kolom++;
        }
    }
}


