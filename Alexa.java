/**********************************************************************
 2 * Alexa . j a v a
 3 *The only problem i encountred was getting everything to compile with no errors.
 4 *@ALantis Green
 5 *@date : 8/29/2022
 6 *@ a c k n o w l e d g e m e n t : Alantis Green
 7 ***********************************************************************/

import java.util.Scanner;

public class Alexa {
    public static void main(String[] args) {
        String name;
        String job;
        String age;
        String hobby;


        Scanner scnr  = new Scanner(System.in);
        System.out.println("Hello! My name is Alexis. What is your name?");
        name = scnr.next();

        System.out.println(" What do you do" + "," + name + "?" );
        job = scnr.next();

        System.out.println("Awesome, How old are you?");
        age = scnr.next( );

        System.out.println (" Okay, What do you like to do for fun");
         hobby = scnr.next( );

         System.out.println( "Well it was great speaking to you," + name);

         System.out.println( "if you need me again just say Hey Alexa or Hello Alexa");




    }
}
