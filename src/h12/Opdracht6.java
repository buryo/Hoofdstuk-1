package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Burak Sen on 4-11-2016.
 */
public class Opdracht6 extends Applet {

    int[] getallen = {55, 52, 31, 44, 31, 58, 31, 102, 55, 23, 31, 55, 37, 102, 44, 31, 52, 44, 17, 31};


    TextField tekstvak;
    Button knop;
    String schermTekst;

    public void init() {

        tekstvak = new TextField("", 8);
        add(tekstvak);
        knop = new Button("Kies");
        add(knop);
        knop.addActionListener(new KnopListener());
        schermTekst = "";
    }


    public void paint(Graphics g) {
        int x = 50;
        int y = 80;


        g.drawString(schermTekst, x, y);
    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int invoer = Integer.parseInt(tekstvak.getText());
            int teller = 0;
            boolean isGevonden = false;

            for (int i = 0; i < getallen.length; i++) {
                if (getallen[i] == invoer) {
                    teller++;
                    isGevonden = true;
                }
            }

            if (isGevonden) {
                schermTekst = "Waarde is gevonden en komt " + teller + " keer voor";
            } else {
                schermTekst = "Het waarde is niet gevonden";
            }
            repaint();
        }
    }
}
