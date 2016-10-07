package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;

/**
 * Created by Burak Sen on 6-10-2016.
 */
public class Opdracht10o5 extends Applet {

    TextField tekstvak;
    int aantalCijfers;
    Button knop;
    String s, s2, bepaaler;
    Double totaal, gemiddelde, invoer;
    Boolean bepaaler2;
    Color kleur;


    @Override
    public void init() {
        tekstvak = (new TextField("", 25));
        add(tekstvak);
        tekstvak.addActionListener(new KnopListener());

        knop = (new Button("Ok"));
        add(knop);
        totaal = 0.0;
        bepaaler = "";
        gemiddelde = 0.0;
        aantalCijfers = 0;

        kleur = new Color(170,230,190);
    }

    @Override
    public void paint(Graphics g) {
        setBackground(kleur);
        g.drawString("" + bepaaler, 50, 100);
        g.drawString("Het gemiddelde cijfer is: " + gemiddelde, 50, 150);
        g.drawString("Aantal cijfers: " + aantalCijfers, 50, 165);
    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            {
                s = tekstvak.getText();
                invoer = Double.parseDouble(s);

                aantalCijfers++;
                totaal = invoer + totaal;
                gemiddelde = totaal / aantalCijfers;


                if (invoer >= 5.5) {
                    bepaaler = "Voldoende!";
                } else
                    bepaaler = "Je hebt een onvoldoende!! Gefeliciteeeeeerdd!!!";

                tekstvak.setText("");
                repaint();
            }
        }
    }
}
