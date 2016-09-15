package h05;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Burak Sen on 15-9-2016.
 */
public class Opdracht5o2 extends Applet{


    int valerie;
    int jeroen;
    int hans;
    int yas;

    public void init() {
        setSize(1200,800);

        valerie = (70 * 3);
        jeroen = (100 * 3);
        hans = (100 * 3);

        //Type hierboven de kilo bijv. als je wilt dat valier 70 kilo weegt doe je Valerie = (70 * 3)
        // die "3" heeft te maken met de schema schaal


        yas = 600;

    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);

          /* staven */

        g.setColor(Color.green);
        g.fillRect(120, yas - valerie , 20, valerie);       //Valerie
        g.setColor(Color.RED);
        g.fillRect(180, yas - hans, 20, hans);      // Jeroen
        g.setColor(Color.GRAY);
        g.fillRect(240, yas - jeroen, 20, jeroen);      // Hans



        g.drawLine(90, 270, 90, 600);   /*Verticaal lijn*/
        g.drawString("KG", 84, 260 );   /*KG line*/
        g.drawLine(90, 600, 300, 600);   /*horizontaal lijn*/
        g.drawString("Naam", 310, 604 );   /*Naam line*/
        g.drawString("100", 64, 300 );   /*100*/
        g.drawString("80", 64, 360 );   /*80*/
        g.drawString("60", 64, 420 );   /*60*/
        g.drawString("40", 64, 480 );   /*40*/
        g.drawString("20", 64, 540 );   /*20*/
        g.drawString("Valerie", 115, 615 );   /*Valerie*/
        g.drawString("Jeroen", 170, 615 );   /*Jeroen*/
        g.drawString("Hans", 235, 615 );   /*hans*/









    }
}
