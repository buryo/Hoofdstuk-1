package h04;


import java.awt.*;
import java.applet.*;


public class Praktijkopdracht extends Applet {

    public void init() {
    }



    public void paint(Graphics g) {


        g.drawLine(20,35, 240, 35); /*Bovenste lijn*/
        g.drawString("Lijn", 100,50);

        g.drawLine(20,55, 240, 55); /*Rechthoek*/
        g.drawLine(240,55, 240, 160);
        g.drawLine(20,55, 20, 160);
        g.drawLine(20,160, 240, 160);
        g.drawString("Rechthoek", 95,175);

        g.drawRoundRect(20,180, 220, 105, 30, 30 );
        g.drawString("Afgeronde rechthoek", 85, 302);

        /*================================================*/

        g.setColor(Color.MAGENTA);
        g.fillRect(250, 55, 220, 105);
        g.setColor(Color.black);
        g.drawString("Gevlde recthoek met ovaal", 282, 175);

        g.drawOval(250, 55, 220,105);
        g.setColor(Color.MAGENTA);
        g.fillOval(250, 180, 220,105);
        g.setColor(Color.black);
        g.drawString("Gevlde ovaal", 325, 298);

        /*================================================*/

        g.setColor(Color.black);
        g.drawOval(480, 55, 220,105);
        g.setColor(Color.MAGENTA);
        g.fillArc(480, 55, 220, 105, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 505, 175);


        g.drawArc(535,180,100,100,360,360);
        g.drawString("Cirkel", 570, 299);

    }
    }

