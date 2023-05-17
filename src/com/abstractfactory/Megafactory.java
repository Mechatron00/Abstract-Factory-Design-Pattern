package com.abstractfactory;

public class Megafactory
{
    public static AbstractFactory getFactory(String str)
    {
        if(str.equalsIgnoreCase("Cars"))
        {
            return new CarFactory();
        }
        else if(str.equalsIgnoreCase("Engine"))
        {
            return new EngineFactory();
        }
        return null;
    }
}
