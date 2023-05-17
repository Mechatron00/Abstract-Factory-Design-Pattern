package com.abstractfactory;

import java.util.Scanner;

public class Salesman
{
    char option;
    public void giveInfo()
    {
        Scanner sc =new Scanner(System.in);
        do
        {
            AbstractFactory car =Megafactory.getFactory("Cars");
            AbstractFactory engine =Megafactory.getFactory("Engine");


            System.out.println("Choose the car you want info about!\n");
            System.out.println("a)Aventador LP 700\n");
            System.out.println("b)Aventador  S-Roadster\n");
            System.out.println("c)Aventador svj\n");
            System.out.println("d)Skyline GTR Coupe\n");
            System.out.println("e)GT-R MODEL 2013\n");
            System.out.println("f)GT-R MODEL 2023\n");
            System.out.println("g)Exit");

            option = sc.next().charAt(0);


            switch (option)
            {
                case 'a':
                    Cars lp=car.getCar("Aventador LP 700");
                    Engines vlp=engine.getEngine("v12 petrol");
                    System.out.println(lp.getCarInfo()+"\n");
                    System.out.println(vlp.getEngineinfo()+"\n");
                    break;
                case 'b':
                    Cars s=car.getCar("Aventador s roadster");
                    Engines vs=engine.getEngine("v12 petrol");
                    System.out.println(s.getCarInfo()+"\n");
                    System.out.println(vs.getEngineinfo()+"\n");
                    break;
                case 'c':
                    Cars svj=car.getCar("Aventador svj");
                    Engines vsvj=engine.getEngine("v12 petrol");
                    System.out.println(svj.getCarInfo()+"\n");
                    System.out.println(vsvj.getEngineinfo()+"\n");
                    break;
                case 'd':
                    Cars skyline=car.getCar("gtr skyline");
                    Engines vskyline=engine.getEngine("v6 diesel");
                    System.out.println(skyline.getCarInfo()+"\n");
                    System.out.println(vskyline.getEngineinfo()+"\n");
                    break;
                case 'e':
                    Cars gtr2013=car.getCar("GTR 2013");
                    Engines vgtr2013=engine.getEngine("v6 petrol");
                    System.out.println(gtr2013.getCarInfo()+"\n");
                    System.out.println(vgtr2013.getEngineinfo()+"\n");
                    break;
                case 'f':
                    Cars gtr2023=car.getCar("GTR 2023");
                    Engines vgtr2023=engine.getEngine("v6 petrol");
                    System.out.println(gtr2023.getCarInfo()+"\n");
                    System.out.println(vgtr2023.getEngineinfo()+"\n");
                    break;
                case 'g':
                    System.out.println("Thank you for visit. Come back later to see new cars!");
                    break;
                default:
                    System.out.println("Sorry no such car available yet. Please visit later...!");

            }


        }
        while(option != 'g');
    }
}
