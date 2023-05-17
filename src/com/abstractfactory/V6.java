package com.abstractfactory;

public class V6 implements Engines
{
    private String model;

    private String fuelType;

    public V6(String model,  String fuelType) {
        this.model = model;

        this.fuelType = fuelType;
    }

    @Override
    public String getEngineinfo()
    {
        return
                "Engine information:\n"+
                "model='" + model + '\'' +
                ", fuelType='" + fuelType + '\'';
    }


}
