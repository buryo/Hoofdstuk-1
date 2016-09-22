package h08;

/**
 * Created by Burak Sen on 21-9-2016.
 */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht8o1 extends Applet {
    TextField tekstvak;
    Label label;
    String s;
    Button knopOk;
    Button knopReset;

    public void init() {
        knopOk = new Button();
        knopOk.setLabel("Ok");
        knopOk.addActionListener(new TekstvakListener());

        knopReset = new Button();
        knopReset.setLabel("Reset");
        knopReset.addActionListener(new ResetListener());

        tekstvak = new TextField("", 20);
        label = new Label("Dit is een label");
        tekstvak.addActionListener(new TekstvakListener());
        add(label);
        add(tekstvak);
        add(knopOk);
        add(knopReset);
        s = "";
    }


    public void paint(Graphics g) {
        g.drawString(s, 70, 80);
    }


    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            tekstvak.setText("");
            repaint();
        }
    }

    class ResetListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            s = "";
            repaint();
        }
    }
}