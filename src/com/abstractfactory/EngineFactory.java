package com.abstractfactory;

public class EngineFactory implements AbstractFactory
{

    @Override
    public Cars getCar(String str) {
        return null;
    }

    @Override
    public Engines getEngine(String str)
    {
        if(str.equals("v6 petrol"))
        {
            V6 v6p =new V6("V-6","Petrol");
            return v6p;

        }
       else if(str.equals("v6 diesel"))
        {
            V6 v6p =new V6("V-6","Diesel");
            return v6p;

        }
        else if(str.equals("v12 petrol"))
        {
            V6 v6p =new V6("V-12","Petrol");
            return v6p;

        }
        else return null;
    }
}
