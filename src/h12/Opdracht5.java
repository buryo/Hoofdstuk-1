package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Burak Sen on 4-11-2016.
 */
public class Opdracht5 extends Applet {

    int[] getallen = {55, 44, 58, 102, 23, 37, 31, 52, 17};


    TextField tekstvak;
    Button knop;
    String schermTekst;

    @Override
    public void init() {

        tekstvak = new TextField("", 8);
        add(tekstvak);
        knop = new Button("Kies");
        add(knop);
        knop.addActionListener(new KnopListener());
        schermTekst = "";

    }

    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 80;


        g.drawString(schermTekst, x, y);
    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int invoer = Integer.parseInt(tekstvak.getText());

            boolean isGevonden;
            int index = 0;

            isGevonden = false;
            for (int i = 0; i < getallen.length; i++) {
                if (getallen[i] == invoer) {
                    isGevonden = true;
                    index = i;
                }
            }

            if (isGevonden) {
                schermTekst = "Is gevonden. Index is " + index;

            } else {
                schermTekst = "Is niet Gevonden";
            }
            repaint();
        }
    }
}
