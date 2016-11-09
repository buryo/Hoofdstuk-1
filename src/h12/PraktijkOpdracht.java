package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Burak Sen on 9-11-2016.
 */
public class PraktijkOpdracht extends Applet {

    String[] databasenamen, databasenummers;
    Button knop;
    TextField tekstvaknaam, tekstvaktelefoon;
    Label naam, nummer;
    int x, y, teller;


    public void init() {

        // ***** tekstvak voor de naam, tekstvak voor de telefoonnummer en een knop *****
        naam = new Label("Naam :");
        add(naam);
        tekstvaknaam = new TextField("", 8);
        add(tekstvaknaam);
        nummer = new Label("Nummer :");
        add(nummer);
        tekstvaktelefoon = new TextField("", 12);
        add(tekstvaktelefoon);
        knop = new Button("Ok");
        add(knop);
        knop.addActionListener(new KnopListener());
        //---------------------------
        setSize(350, 600);
        databasenamen = new String[10];
        databasenummers = new String[databasenamen.length];
        x = 40;
        y = 120;
        teller = 0;
    }

    public void paint(Graphics g) {
        if (teller == databasenamen.length)
            for (int i = 0; i < databasenamen.length; i++) {
                g.drawString("" + databasenamen[i] + " " + databasenummers[i], 20, 20 * i + 50);
            }
    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            databasenamen[teller] = tekstvaknaam.getText();
            databasenummers[teller] = tekstvaktelefoon.getText();
            teller++;


            tekstvaknaam.setText("");
            tekstvaktelefoon.setText("");

            repaint();
        }
    }
}



