package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Burak Sen on 7-10-2016.
 */
public class Praktijkopdracht10 extends Applet {

    TextField tekstvak;
    int slecht, onvoldoende, matig, voldoende, goed;
    String s,s1,s2, uitslag, bepaaler;
    int cijferinvoer;
    Color kleur;



    @Override
    public void init() {
        tekstvak = new TextField("", 15);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);

        uitslag = "";
        bepaaler = "";
        kleur = new Color(170,230,190);


    }

    @Override
    public void paint(Graphics g) {
        setBackground(kleur);
        g.drawString("" + bepaaler, 60 ,100);

    }

    class TekstvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijferinvoer = Integer.parseInt(s);

            if (cijferinvoer == 1 || cijferinvoer == 2 || cijferinvoer == 3){
                bepaaler = "Uitslag is SLECHT.";
                tekstvak.setText("");
                repaint();
            }

            if (cijferinvoer == 4) {
                bepaaler = "Uitslag is ONVOLDOENDE.";
                tekstvak.setText("");
                repaint();
            }

            if (cijferinvoer == 5) {
                bepaaler = "Uitslag is MATIG.";
                tekstvak.setText("");
                repaint();
            }

            if (cijferinvoer == 6 || cijferinvoer == 7) {
                bepaaler = "Uitslag is VOLDOENDE.";
                tekstvak.setText("");
                repaint();
            }

            if (cijferinvoer == 8 || cijferinvoer == 9 || cijferinvoer == 10) {
                bepaaler = "Uitslag is GOED.";
                tekstvak.setText("");
                repaint();
            }
            if (cijferinvoer == 0 || cijferinvoer > 10){
                bepaaler = "Verkeerd cijfer ingevoerd!";
                tekstvak.setText("");
                repaint();
            }

        }
    }
}
