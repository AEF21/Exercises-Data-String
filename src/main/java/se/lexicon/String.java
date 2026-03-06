package se.lexicon;


import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Spliterators;

public class String {
    static void main() {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
        exercise9();
        exercise10();
        exercise11();

    }

    static void exercise1() {
        java.lang.String message = "Java";
        System.out.println("What is Length Of String message?");
        int Length = message.length();
        System.out.println("Java:" + Length);
    }
    static void exercise2() {
        java.lang.String messageText = "Long example sentence?";
        char result = messageText.charAt(6);
        System.out.println("The char at index 6 is: " + result);
    }
    static void exercise3(){
        java.lang.String messageText = "Even longer example sentence";
        int result = messageText.indexOf('o');
        System.out.println("The index position of 'o' is:" + result);
    }
    static void exercise4(){
        java.lang.String messageText = "Ok this is not as long!";
        java.lang.String part = messageText.substring(11);
        System.out.println(part);
    }
    static void exercise5(){
        java.lang.String messagetext = "CAPS EQUALS SCREAMING";
        java.lang.String messagetextLowerCase = messagetext.toLowerCase();
        System.out.println(messagetextLowerCase);
        java.lang.String messagetextlowercase = "caps equals screaming";
        java.lang.String messagetextUpperCase = messagetext.toUpperCase();
        System.out.println(messagetextUpperCase);
    }
    static void exercise6(){
        java.lang.String escapesequences = "\tJ\ta\tv\ta\t";
        escapesequences = escapesequences.trim();
        System.out.println("Trimed escapesequences is: "+ escapesequences);
    }
    static void exercise7(){
        int number = 20;
        java.lang.String text = java.lang.String.valueOf(number);
        text= text + "20";
        System.out.println(text);
    }
    static void exercise8(){
        java.lang.String text = "Oil and Water";
        java.lang.String [] parts = text.split(" ");
        for (java.lang.String word : parts) {
        if (!word.equals("and")) {
         System.out.println(word);
        }
        }
    }
    static void exercise9() {
        java.lang.String names = "Carl,Susie,Fredrick,Bob,Erik";
        java.lang.String[] result = names.split(",");
        for (java.lang.String name : result) {
        System.out.println(name);
        }
    }

    static void exercise10(){
        java.lang.String messagetext = "ThisShouldBeConverted";
        java.lang.String result = Arrays.toString(messagetext.toCharArray());
        System.out.println(result);
    }
    static void exercise11(){
        char[] chars = {'J','a','v','a'};
        String result = new String();
        System.out.println(result);
    }


}




































