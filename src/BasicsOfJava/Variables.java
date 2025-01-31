package BasicsOfJava;

//Variables are of two types : Primitive (For storing simple Values) and Reference (for storing Complex Objects)
/* Primitive : byte [(1 bytes)(-127 to 127)], short (2), int(4), long(8), float(4), double(8), char(2), boolean(1 (says true/false))
 */
/* Reference : here we need to allocate memory, it has its members

 */


import java.awt.*;
import java.util.Date;

public class Variables {
    public static void main(String[] args) {
        byte x;
        x = 10;
        System.out.println(x);
        int x1 = 73643;
        long x2= 2_22_28_96_423L; //IF YOU GIVE INT TO THIS then IT WILL SHOW AN ERROR, UNDERSCORES ARE USED AS LIKE WE USE COMMA IN REAL LIFE, EVEN IF WE USE LONG IT WILL GIVE AN ERROR, AS IT WILL STILL TAKE IT AS AN INTERGER, SO TO AVOID THAT WE ADD L or l AT THE END OF THE NUMBER)
        System.out.println(x1);
        System.out.println(x2);
        double z=1.5;
        System.out.println(z);
        float y = 10.5F;//(same it sees as a double so add F to say its float)
        System.out.println(y);
        boolean isEligible =  false;

        //Reference
        Date now = new Date();
        //now.getTime(); now this dot operater gives us more flexibility.
        System.out.println(now);


        //STRINGS


        String message = new String("Hello World"); //original way as it is a reference type
        String message1 = "Hello Mriganshu";// but in java it is a short form, but don't make mistake to think it as a primitive type
        System.out.println(message);
        System.out.println(message1.length()); //much more like length, try it yourself
        //double quote
        String message3 = "Hello\"world\"";
        System.out.println(message3);


    }
}
