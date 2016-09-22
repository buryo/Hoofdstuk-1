package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;

/**
 * Created by Burak Sen on 21-9-2016.
 */
public class Opdracht8o3 extends Applet {
    TextField tekstVak;
    Button knop;
    Label label;
    double uitkomst;


    public void init() {
        knop = new Button("");
        knop.setLabel("Ok");
        knop.addActionListener(new KnopListener());

        tekstVak = new TextField("", 30);
        label = new Label("Type hierin het bedrag");
        tekstVak.addActionListener(new KnopListener());
        add(label);
        add(tekstVak);
        add(knop);

    }


    public void paint(Graphics g) {

        g.drawString("€" + uitkomst, 70, 80);
    }


    class KnopListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tekstVak.getText();
            uitkomst = Double.parseDouble(s);
            uitkomst = (uitkomst / 100) * 21 + uitkomst;
            repaint();
            tekstVak.setText("Het bedrag is uitgerekend inclusief BTW");

        }
    }


}
