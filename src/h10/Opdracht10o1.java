package h10;

/**
 * Created by Burak Sen on 5-10-2016.
 */

import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht10o1 extends Applet {
    TextField tekstvak1, tekstvak2, tekstvak3, tekstvak4, tekstvak5;
    Label label;
    String s1, s2, s3, s4, s5, tekst, tekst2;
    int getal1, getal2, getal3, getal4, getal5;
    Color kleur;

    public void init() {
        tekstvak1 = new TextField("", 15);
        tekstvak1.addActionListener(new Tekstvak1listener());
        tekstvak1.addActionListener(new Tekstvak2listener());

        tekstvak2 = new TextField("", 15);
        tekstvak2.addActionListener(new Tekstvak1listener());
        tekstvak2.addActionListener(new Tekstvak2listener());

        tekstvak3 = new TextField("", 15);
        tekstvak3.addActionListener(new Tekstvak1listener());
        tekstvak3.addActionListener(new Tekstvak2listener());

        tekstvak4 = new TextField("", 15);
        tekstvak4.addActionListener(new Tekstvak1listener());
        tekstvak4.addActionListener(new Tekstvak2listener());

        tekstvak5 = new TextField("", 15);
        tekstvak5.addActionListener(new Tekstvak1listener());
        tekstvak5.addActionListener(new Tekstvak2listener());

        add(tekstvak1);
        add(tekstvak2);
        add(tekstvak3);
        add(tekstvak4);
        add(tekstvak5);

        kleur = new Color(170,230,190);

    }

    public void paint(Graphics g) {
        setBackground(kleur);
        g.drawString("Boven staande vakken mogen niet leeg zijn.", 50, 120);
        g.drawString(tekst, 50, 150);
        g.drawString(tekst2, 50, 165);

    }

    class Tekstvak1listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s1 = tekstvak1.getText();
            s2 = tekstvak2.getText();
            s3 = tekstvak3.getText();
            s4 = tekstvak4.getText();
            s5 = tekstvak5.getText();

            getal1 = Integer.parseInt(s1);
            getal2 = Integer.parseInt(s2);
            getal3 = Integer.parseInt(s3);
            getal4 = Integer.parseInt(s4);
            getal5 = Integer.parseInt(s5);

            if (getal1 > getal2 && getal1 > getal3 && getal1 > getal4 && getal1 > getal5) {
                tekst = getal1 + " is het hoogste getal die u heeft ingevoerd.";
            }
            if (getal2 > getal1 && getal2 > getal3 && getal2 > getal4 && getal2 > getal5) {
                tekst = getal2 + " is het hoogste getal die u heeft ingevoerd.";
            }
            if (getal3 > getal1 && getal3 > getal2 && getal3 > getal4 && getal3 > getal5) {
                tekst = getal3 + " is het hoogste getal die u heeft ingevoerd.";
            }
            if (getal4 > getal1 && getal4 > getal2 && getal4 > getal3 && getal4 > getal5) {
                tekst = getal4 + " is het hoogste getal die u heeft ingevoerd.";
            }
            if (getal5 > getal1 && getal5 > getal2 && getal5 > getal3 && getal5 > getal4) {
                tekst = getal5 + " is het hoogste getal die u heeft ingevoerd.";
            }
            repaint();

        }
    }

    class Tekstvak2listener implements ActionListener   {
        @Override
        public void actionPerformed(ActionEvent e) {
            s1 = tekstvak1.getText();
            s2 = tekstvak2.getText();
            s3 = tekstvak3.getText();
            s4 = tekstvak4.getText();
            s5 = tekstvak5.getText();

            getal1 = Integer.parseInt(s1);
            getal2 = Integer.parseInt(s2);
            getal3 = Integer.parseInt(s3);
            getal4 = Integer.parseInt(s4);
            getal5 = Integer.parseInt(s5);

            if (getal1 < getal2 && getal1 < getal3 && getal1 < getal4 && getal1 < getal5) {
                tekst2 = getal1 + " is het laagste getal die u heeft ingevoerd.";
            }
            if (getal2 < getal1 && getal2 < getal3 && getal2 < getal4 && getal2 < getal5) {
                tekst2 = getal2 + " is het laagste getal die u heeft ingevoerd.";
            }
            if (getal3 < getal1 && getal3 < getal2 && getal3 < getal4 && getal3 < getal5) {
                tekst2 = getal3 + " is het laagste getal die u heeft ingevoerd.";
            }
            if (getal4 < getal1 && getal4 < getal2 && getal4 < getal3 && getal4 > getal5) {
                tekst2 = getal4 + " is het laagste getal die u heeft ingevoerd.";
            }
            if (getal5 < getal1 && getal5 < getal2 && getal5 < getal3 && getal5 < getal4) {
                tekst2 = getal5 + " is het laagste getal die u heeft ingevoerd.";
            }
            repaint();

        }
    }

}