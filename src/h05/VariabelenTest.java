package h05;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Burak Sen on 14-9-2016.
 */
public class VariabelenTest extends Applet{


    Color achtergrondkleur;
    Color tekst;
    int getal1;
    int getal2;
    Font mijnFont;

    @Override
    public void init() {
        super.init();
        setSize(600,400);
        achtergrondkleur = new Color(255, 255, 153);
        tekst = new Color(0, 38, 153);
        getal1 = 20;
        getal2 = 30;
        setBackground(achtergrondkleur);
        mijnFont = new Font("TimesRoman", Font.BOLD, 18);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(tekst);
        int x = 50;
        int y = 50;
        g.setFont(mijnFont);
        g.drawString("Som is: " + (getal1 + getal2), x, y);
        y = y + 20;
        g.drawString("Som is: " + (getal1 * getal2), x, y);



    }
}
