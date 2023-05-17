package com.abstractfactory;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
//        Salesman vineet =new Salesman();
//        vineet.giveInfo();

        ////////practice
        int x =125;
        String test = Integer.toString(x);
        String reverse="";

        for(int i=test.length()-1; i>=0; i--)
        {
            reverse += test.charAt(i);
        }
        System.out.println(reverse);


    }
}
