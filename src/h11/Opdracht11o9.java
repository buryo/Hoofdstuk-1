package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11o9 extends Applet {
    Color zwart;
    Color wit;

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.CYAN);
        int y = 50;
        int x = 50;
        int breedte = 35, hoogte = 35, rij = 0, kolom = 0;
        zwart = (Color.black);
        wit = Color.WHITE;

        for (rij = 0; rij < 8; rij++) {
            for (kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(zwart);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(wit);
                    g.fillRect(x, y, breedte, hoogte);
                }



                x += breedte;
            }
            x = 50;
            y += 20;
        }
    }
}