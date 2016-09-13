package h04;

import java.awt.*;
import java.applet.*;

public class Opdracht4o1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);


        /*Rechthoek*/
        g.drawLine(90, 50, 120, 30);
        g.drawLine(120, 30, 150, 50);
        g.drawLine(90, 50, 150, 50);


        /*Huisje*/
        g.drawLine(90, 200, 90, 270);
        g.drawLine(90, 200, 150, 140);
        g.drawLine(90, 200, 200, 200);
        g.drawLine(150, 140, 200, 200);
        g.drawLine(200, 200, 200, 270);
        g.drawLine(90, 270, 200, 270);
        g.drawLine(100, 245, 100, 270);
        g.drawLine(100, 245, 115, 245);
        g.drawLine(115, 245, 115, 270);
        g.drawLine(145, 215, 168, 215);
        g.drawLine(168, 215, 168, 230);
        g.drawLine(145, 215, 145, 230);
        g.drawLine(145, 230, 168, 230);


        /*vlag*/

        g.fillRect(250, 50, 125, 25);
        g.setColor(Color.white);
        g.fillRect(250, 75, 125, 25);
        g.setColor(Color.blue);
        g.fillRect(250, 100, 125, 25);
        g.setColor(Color.black);
        g.drawLine(250, 50, 250, 250);


        /*staafdiagram*/


        g.drawLine(90, 400, 90, 600);   /*Verticaal lijn*/
        g.drawString("KG", 84, 389 );   /*KG line*/
        g.drawLine(90, 600, 290, 600);   /*horizontaal lijn*/
        g.drawString("Naam", 298, 604 );   /*Namen line*/
        g.drawString("100", 64, 433 );   /*100*/
        g.drawString("80", 64, 466 );   /*80*/
        g.drawString("60", 64, 499 );   /*60*/
        g.drawString("40", 64, 532 );   /*40*/
        g.drawString("20", 64, 565 );   /*20*/
        g.drawString("Valerie", 115, 615 );   /*Valerie*/
        g.drawString("Jeroen", 170, 615 );   /*Jeroen*/
        g.drawString("Hans", 235, 615 );   /*hans*/


        /* staven */

        g.setColor(Color.green);
        g.fillRect(120, 530, 20, 70);
        g.setColor(Color.RED);
        g.fillRect(180, 430, 20, 170);
        g.setColor(Color.GRAY);
        g.fillRect(240, 465, 20, 135);


        /*Opdracht 4.5 ellips */

        g.setColor(Color.blue);
        g.fillRect(400, 380, 100, 50);
        g.setColor(Color.yellow);
        g.fillArc(400, 380, 100, 50, 360, 360);


        /*Opdracht 4.6 Stoplicht */

        g.setColor(Color.black);
        g.fillRoundRect(400, 499, 100, 205, 15, 15);
        g.setColor(Color.red);
        g.fillOval(421, 507, 60, 60);
        g.setColor(Color.yellow);
        g.fillOval(421, 572, 60, 60);
        g.setColor(Color.green);
        g.fillOval(421, 637, 60, 60);


        /*Opdracht 4.7 Dobbelsteen */

        g.setColor(Color.black);
        g.drawRoundRect(500, 70, 100, 100, 30, 30);
        g.fillOval(530, 95, 5, 5);
        g.fillOval(568, 95, 5, 5);
        g.fillOval(530, 135, 5, 5);
        g.fillOval(568, 135, 5, 5);


    }
}
























