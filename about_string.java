package com.company;
import java.util.Scanner;
public class about_string {
    public static void main(String[] args) {
        // Problem 1
        String z= "NICE TO SEE YOU";
        z=z.toLowerCase(); // use to lower case
        System.out.println(z);
        // Problem 2
        String text= "To Lower Case";
        text = text.replace(" ","_"); // use to replace charecter
        System.out.println(text);
        String name="Hello Raghav";
        name=name.replace("Raghav","Vijay"); // Use to replace charecter
        System.out.println(name);
        String k="Hello Everybody, how  are you";
        String u="Why are you   doing so";
        System.out.println("K variable having 3 Spaces: "+k.indexOf("  ")); //Index of Space
        System.out.println("K variable having 3 Spaces: "+k.indexOf("   ")); //Index of Space
        System.out.println("K variable having 1 Spaces: "+k.indexOf(" "));
        System.out.println("U variable having 3 Spaces: "+u.indexOf("   "));
        // Problem 3
        String Myletter="Dear Abhat,\n\tThis is a Java Tutorial.\n\tThanks"; // n=Next Line t= tab
        System.out.println(Myletter);
    }
}
