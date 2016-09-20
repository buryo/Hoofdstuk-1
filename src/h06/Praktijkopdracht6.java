package h06;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Burak Sen on 19-9-2016.
 */
public class Praktijkopdracht6 extends Applet{



    double cursist;

    double cijfer1;
    double cijfer2;
    double cijfer3;
    int aantalcijfers;
    double uitslagcursist;

    public void init() {
        aantalcijfers = 3;
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;

        cursist =  cijfer1 + cijfer2 + cijfer3 ;

        uitslagcursist = (cursist / aantalcijfers) * 10 ;
        uitslagcursist = (int) uitslagcursist;
        uitslagcursist = (double) uitslagcursist / 10 ;


        //uitslagcursist = Math.round(uitslagcursist * 10);
    }


    public void paint(Graphics g) {



        g.drawString(" Het gemidelde cijfer is: " +  uitslagcursist , 50, 70);


    }

}
