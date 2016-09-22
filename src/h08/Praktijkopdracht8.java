package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;

/**
 * Created by Burak Sen on 21-9-2016.
 */
public class Praktijkopdracht8 extends Applet{


    TextField tekstvak1;
    TextField tekstvak2;
    Button vermenigvuldigen;
    Button delen;
    Button optellen;
    Button aftrekken;
    double uitkomst;


    public void init(){
        setSize(700,250);

        tekstvak1 = new TextField("", 20);
        tekstvak2 = new TextField("", 20);

        vermenigvuldigen = new Button();
        vermenigvuldigen.setLabel("*");
        vermenigvuldigen.addActionListener(new Vermenigvuldigen());


        delen = new Button();
        delen.setLabel("/");
        delen.addActionListener(new Delen());

        optellen = new Button();
        optellen.setLabel("+");
        optellen.addActionListener(new Optellen());

        aftrekken = new Button();
        aftrekken.setLabel("-");
        aftrekken.addActionListener(new Aftrekken());


        add(tekstvak1);
        add(tekstvak2);
        add(vermenigvuldigen);
        add(delen);
        add(optellen);
        add(aftrekken);
    }

    class Vermenigvuldigen implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String s1 = tekstvak1.getText();
            double ingevoerdgetal = Double.parseDouble(s1);

            String s2 = tekstvak2.getText();
            double ingevoerdgetal2 = Double.parseDouble(s2);

            uitkomst = ingevoerdgetal * ingevoerdgetal2;
            tekstvak1.setText("" + uitkomst);
            tekstvak2.setText("");

            repaint();
        }
    }

    class Delen implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {
            String s1 = tekstvak1.getText();
            double ingevoerdgetal = Double.parseDouble(s1);

            String s2 = tekstvak2.getText();
            double ingevoerdgetal2 = Double.parseDouble(s2);

            uitkomst = ingevoerdgetal / ingevoerdgetal2;
            tekstvak1.setText("" + uitkomst);
            tekstvak2.setText("");

            repaint();
        }
    }


    class Optellen implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {
            String s1 = tekstvak1.getText();
            double ingevoerdgetal = Double.parseDouble(s1);

            String s2 = tekstvak2.getText();
            double ingevoerdgetal2 = Double.parseDouble(s2);

            uitkomst = ingevoerdgetal + ingevoerdgetal2;
            tekstvak1.setText("" + uitkomst);
            tekstvak2.setText("");

            repaint();
        }
    }

    class Aftrekken implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {
            String s1 = tekstvak1.getText();
            double ingevoerdgetal = Double.parseDouble(s1);

            String s2 = tekstvak2.getText();
            double ingevoerdgetal2 = Double.parseDouble(s2);

            uitkomst = ingevoerdgetal - ingevoerdgetal2;
            tekstvak1.setText("" + uitkomst);
            tekstvak2.setText("");

            repaint();
        }
    }
}
