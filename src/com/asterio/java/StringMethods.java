package com.asterio.java;

public class StringMethods {
    public static void main(String[] args) {

        String hero1 = "Batman";
        String hero2 = "Superman";
        String hero3 = "     Flash      ";
        int totalHeros = 3;
        String hero4 = "Wonder Woman";

//        System.out.println(hero1.length());
//        System.out.println(hero1.substring(1));
//        System.out.println(hero1.substring(3, 6));
//        System.out.println(hero2.contains("man"));
//        System.out.println(hero3.equals("Flash"));
//        System.out.println(hero1.isEmpty());

        System.out.println(hero1.concat(hero2));
        System.out.println(hero1.replace('B', 'C').toUpperCase());
        System.out.println(hero3.trim().toUpperCase());
        System.out.println(hero3.trim() + "y " + hero4);
    }
}
