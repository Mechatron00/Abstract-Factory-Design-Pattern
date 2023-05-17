package com.abstractfactory;

public class V12 implements Engines
{
    private String model;

    private String fuelType;

    public V12(String model,  String fuelType) {
        this.model = model;

        this.fuelType = fuelType;
    }

    @Override
    public String getEngineinfo()
    {
        return
                "model='" + model + '\'' +
                ", fuelType='" + fuelType + '\'';
    }
}
