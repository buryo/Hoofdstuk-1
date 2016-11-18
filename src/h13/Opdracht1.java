package h13;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Burak Sen on 17-11-2016.
 */
public class Opdracht1 extends Applet {

    Button green, red, yellow, blue, magenta;
    String kleur;
    boolean activator;

    public void init() {
        kleur = "";


        green = new Button("Green");
        add(green);
        green.setBackground(Color.green);
        green.addActionListener(new GreenListener());

        red = new Button("Red");
        add(red);
        red.setBackground(Color.red);
        red.addActionListener(new RedListener());

        yellow = new Button("Yellow");
        add(yellow);
        yellow.setBackground(Color.yellow);
        yellow.addActionListener(new YellowListener());

        blue = new Button("Blue");
        add(blue);
        blue.setBackground(Color.blue);
        blue.addActionListener(new BlueListener());

        magenta = new Button("Purple");
        add(magenta);
        magenta.setBackground(Color.MAGENTA);
        magenta.addActionListener(new MagentaListener());

    }

    public void paint(Graphics g) {
        if (activator) {
            g.drawString("This color is: " + kleur, 80, 90);
        }
    }

    class GreenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kleur = "Green";
            activator = true;
            repaint();
        }
    }

    class RedListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kleur = "Red";
            activator = true;
            repaint();
        }
    }

    class YellowListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kleur = "Yellow";
            activator = true;
            repaint();
        }
    }

    class BlueListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kleur = "Blue";
            activator = true;
            repaint();
        }
    }

    class MagentaListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kleur = "Magenta";
            activator = true;
            repaint();
        }
    }

}
