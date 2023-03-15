package com.java.basics.stringequalsexample;

/* Lets us understand the theory of String pool
*
* == creates single object in string pool
* new String() creates 2 different object in heap memory
* For more understanding see the code below
* */
public class StringEqualsDemo {
    public static void main(String[] args) {
        String str1 = "dhirajkumar";
        String str2 = "dhirajkumar";
        if (str1 == str2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (str1.equals(str2)) {
            System.out.println("Equals true");
        } else {
            System.out.println("Equals false");
        }

        String str3 = new String("jaiswal");
        String str4 = new String("jaiswal");
        if (str3 == str4) {
            System.out.println("Equals == new operator true");
        } else {
            System.out.println("Equals == new operator false");
        }
        if (str3.equals(str4)) {
            System.out.println("Equals equals new operator true");
        } else {
            System.out.println("Equals equals new operator false");
        }
    }
}
