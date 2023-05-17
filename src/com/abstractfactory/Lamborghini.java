package com.abstractfactory;

public class Lamborghini implements Cars
{
    private final String manufacturer = "Lamborghini";
    private String model;
    private String type;
    private String hp;
    private String yom;
    private double price;

    public Lamborghini(String model,String type, String hp, String yom, double price) {
        this.model = model;
        this.type= type;
        this.hp = hp;
        this.yom = yom;
        this.price = price;
    }


    @Override
    public String getCarInfo()
    {
        return
                "Car information:\n"+
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", hp='" + hp + '\'' +
                ", yom='" + yom + '\'' +
                ", price=" + price ;

    }
}
