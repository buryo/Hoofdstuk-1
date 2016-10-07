package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Burak Sen on 5-10-2016.
 */

public class Opdracht10o3 extends Applet {

    TextField maandnummervak, jaarvak;
    String s, s2, tekst, tekst2;
    int maand, jaar;
    Label labelmaand, labeljaar;

    public void init() {
        labelmaand = new Label("Type hier het maandnummer: ");
        maandnummervak = new TextField("", 10);
        maandnummervak.addActionListener(new TekstvakListener());

        jaarvak = new TextField("", 10);
        jaarvak.addActionListener(new TekstvakListener2());
        labeljaar = new Label("Type hier het jaar in: ");

        add(labelmaand);
        add(maandnummervak);

        add(labeljaar);
        add(jaarvak);

        tekst = "";
        tekst2 = "";
    }


    public void paint(Graphics g) {
        g.drawString( tekst, 50, 100);
        g.drawString( tekst2, 50, 120);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = maandnummervak.getText();
            maand = Integer.parseInt(s);
            switch (maand) {
                case 1:
                    tekst = "Januari";
                    break;
                case 2:
                    tekst = "Februari";
                    break;
                case 3:
                    tekst = "Maart";
                    break;
                case 4:
                    tekst = "April";
                    break;
                case 5:
                    tekst = "Mei";
                    break;
                case 6:
                    tekst = "Juni";
                    break;
                case 7:
                    tekst = "Juli";
                    break;
                case 8:
                    tekst = "Augustus";
                    break;
                case 9:
                    tekst = "September";
                    break;
                case 10:
                    tekst = "Oktober";
                    break;
                case 11:
                    tekst = "November";
                    break;
                case 12:
                    tekst = "December";
                    break;
                default:
                    tekst = "U moet een getal tussen de 1 en de 12 invullen !!";
                    break;
            }
            repaint();
        }
    }

    class TekstvakListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s2 = jaarvak.getText();
            jaar = Integer.parseInt(s2);

            if ((jaar % 4 == 0 && !(jaar % 100 == 0)) ||
                    jaar % 400 == 0) {

                tekst2 = "" + jaar + " is een schrikkeljaar";
            } else {

                tekst2 = "" + jaar + " is geen schrikkeljaar";
            }
            repaint();
        }
    }

}
