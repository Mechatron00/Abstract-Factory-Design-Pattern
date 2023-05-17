package com.abstractfactory;

public class CarFactory implements AbstractFactory
{
    public Cars getCar(String str)
    {
        if (str.equalsIgnoreCase("Aventador lp 700"))
        {
            Lamborghini lp = new Lamborghini("Aventador LP 700","Supercar", "700hp", "2011",50300000 );
            return lp;
        }
       else if (str.equalsIgnoreCase("Aventador s roadster"))
        {
            Lamborghini s = new Lamborghini("Aventador  S-Roadster","Supercar", "740hp", "2017",57500000 );
            return s;
        }
       else if (str.equalsIgnoreCase("Aventador svj"))
        {
            Lamborghini svj = new Lamborghini("Lamborghini  SVJ-Roadster","Supercar", "780hp", "2019",71800000 );
            return svj;
        }

        else if (str.equalsIgnoreCase("gtr skyline"))
        {
            Nissan skyline = new Nissan("Skyline GTR Coupe","Sports Car", "475hp", "2002",25000000 );
            return skyline;
        }
        else if (str.equalsIgnoreCase("GTR 2013"))
        {
            Nissan gtr13 = new Nissan("GT-R MODEL 2013","Sports Car", "550hp", "2013",30000000 );
            return gtr13;
        }
        else if (str.equalsIgnoreCase("GTR 2023"))
        {
            Nissan gtr23 = new Nissan("GT-R MODEL 2023","Supercar", "570hp", "2023",35000000 );
            return gtr23;
        }
        else return null;
    }

    @Override
    public Engines getEngine(String str) {
        return null;
    }
}
