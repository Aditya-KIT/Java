package com.company;
public class variables {
    public static void main(String[] args) {
        byte a=4; /* store 1 byte value = 8 bits
                default value of byte=0
                strors range -128 to 127 */
        short b= 86; /* takes 2 byte
                  default value=0*/
        int c= 23;    /*Takes 4 bytes*/
        float d=9.3f; // takes 4 bytes
        long e=2223; // Takes 8 bytes
        double f= 54433;        //takes 8 bytes
        char g= 'a'; //takes 1 byte

        int x=12;
        int y=111;
        System.out.println(x+y);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++c);
        System.out.println(f--);
        System.out.println(f);
        String s= "Hello";
        System.out.println(s);
        int k=3;
        System.out.println(++k*8); //as ++ has high order than multiplication
        char ch='i';
        System.out.println(++ch);
    }
}
