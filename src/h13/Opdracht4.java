package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Burak Sen on 17-11-2016.
 */
public class Opdracht4 extends Applet {

    Button knopRed, knopGray;
    boolean activatorRed, activatorGray;

    public void init() {
        setSize(1400, 600);
        knopRed = new Button("Rode bakstenen");
        add(knopRed);
        knopRed.addActionListener(new KnopRed());

        knopGray = new Button("Betonblokken");
        add(knopGray);
        knopGray.addActionListener(new KnopGray());

    }

    public void paint(Graphics g) {
        if (activatorRed) {
            tekenMuur(g, 82, 100, 80, 30);
        }
        if (activatorGray) {
            betonMuur(g, 82, 100, 80, 60);
        }

    }

    void tekenMuur(Graphics g, int x, int y, int breedte, int hoogte) {

        Color kleur = Color.red;
        g.setColor(kleur);

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 13; j++) {
                g.fillRect(x * j + 45 * (i % 2), y, breedte, hoogte);

            }
            y += hoogte + 2;

        }
    }

    void betonMuur(Graphics g, int x, int y, int breedte, int hoogte) {

        Color kleur = Color.gray;
        g.setColor(kleur);

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 13; j++) {
                g.fillRect(x * j + 45 * (i % 2), y, breedte, hoogte);

            }
            y += hoogte + 2;

        }
    }

    class KnopRed implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            activatorGray = false;
            activatorRed = true;
            repaint();
        }
    }

    class KnopGray implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            activatorRed = false;
            activatorGray = true;
            repaint();
        }
    }

}

