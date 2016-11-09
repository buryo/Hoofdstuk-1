package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opdracht3 extends Applet {

    TextField[] tekstvelden;
    int[] getallen;
    Button knop;


    public void init() {
        tekstvelden = new TextField[5];
        getallen = new int[5];

        for (int i = 0; i < tekstvelden.length; i++) {
            tekstvelden[i] = new TextField("", 5);
            add(tekstvelden[i]);
        }

        knop = new Button("Ok");
        add(knop);
        knop.addActionListener(new Knoplistener());

    }


    public void paint(Graphics g) {

    }

    class Knoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < tekstvelden.length; i++) {
                getallen[i] = Integer.parseInt(tekstvelden[i].getText());
            }

            Arrays.sort(getallen);

            for (int i = 0; i < getallen.length; i++) {
                tekstvelden[i].setText(String.valueOf(getallen[i]));

            }

        }
    }

}
