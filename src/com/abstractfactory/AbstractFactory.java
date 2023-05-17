package com.abstractfactory;

public interface AbstractFactory
{
    Cars getCar(String str);
    Engines getEngine(String str);

}
