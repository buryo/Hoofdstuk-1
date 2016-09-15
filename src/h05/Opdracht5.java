package h05;

import java.awt.*;
import java.applet.*;


public class Opdracht5 extends Applet {

    Color kleur;
    Color tekstkleur;
    int br;
    int ho;
    Font mijnFont;
    int marginTop;
    int marginRight;
    int marginLeft;
    int halfmarginLeft;
    int cirkelmargin;
    int cirkelbr;
    int onderstaandetexten;


    public void init() {

        setSize(1200,800);
        kleur = (Color.magenta);
        tekstkleur = (Color.black);

        // Hier in voeren
        br = 40;
        ho = 20;
        marginTop = 20;  //Verschil kwa breedte
        marginRight = 66; //Verschil kwa hoogte
        marginLeft = 26;

         /* Om groter te maken doe je *2 br/ho/marginTop/marginRight/marginLeft
         om kleiner te maken doe je /2 br/ho/marginTop/marginRight/marginLeft

         Dus als je het groter wilt maken doe je alle bovenstaande *(getal)
         en om kleiner te maken doe je al die bovenstaande /(getal)
        */


        halfmarginLeft = (marginRight * 2 - 25);
        cirkelmargin = (halfmarginLeft + 20);
        cirkelbr = (br/2);
        onderstaandetexten = (marginTop * 2);


    }



    public void paint(Graphics g) {


        g.drawLine(20,35, 240+ br, 35); /*Bovenste lijn*/
        g.drawString("Lijn", 100,50);

        g.drawLine(20,55  , 240 + br, 55 ); /*Rechthoek*/
        g.drawLine(240 + br,55  , 240 + br, 160 + ho);
        g.drawLine(20,55 , 20, 160 + ho);
        g.drawLine(20,160 + ho , 240 + br, 160 + ho);
        g.drawString("Rechthoek", 95,175 + marginTop);

        g.drawRoundRect(20 ,180 + marginTop, 220 + br, 105 + ho, 30, 30 );
        g.drawString("Afgeronde rechthoek", 85 , 302 + onderstaandetexten);

        /*================================================*/

        g.setColor(kleur);
        g.fillRect(240 + marginRight, 55 , 240 + br, 105 + ho);
        g.setColor(tekstkleur);
        g.drawString("Gevlde recthoek met ovaal", 282 + marginRight, 175 + marginTop);

        g.drawOval(240 + marginRight, 55 , 240 + br,105 + ho);
        g.setColor(kleur);
        g.fillOval(240 + marginRight, 180 + marginTop , 240 + br,105 + ho);
        g.setColor(tekstkleur);
        g.drawString("Gevlde ovaal", 325 + marginRight, 298 + onderstaandetexten);

        /*================================================*/

        g.setColor(tekstkleur);
        g.drawOval(500 + halfmarginLeft , 55, 240 + br,105 + ho);
        g.setColor(kleur);
        g.fillArc(500 + halfmarginLeft , 55, 240 + br, 105 + ho, 0, 45);
        g.setColor(tekstkleur);
        g.drawString("Taartpunt met ovaal eromheen", 525 + halfmarginLeft + 10, 175 + marginTop);


        g.drawArc(555 + cirkelmargin,180 + marginTop,100 + cirkelbr, 100 + cirkelbr,360,360);
        g.drawString("Cirkel", 590 + cirkelmargin, 299 + onderstaandetexten);

    }
}
