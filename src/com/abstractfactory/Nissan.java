package com.abstractfactory;

public class Nissan implements Cars
{
    private final String manufacturer = "Nissan";
    private String model;
    private String type;
    private String hp;
    private String yom;
    private double price;

    public Nissan(String model,String type, String hp, String yom, double price) {
        this.model = model;
        this.type=type;
        this.hp = hp;
        this.yom = yom;
        this.price = price;
    }


    public String getCarInfo() {
        return
                "Car information:\n"+
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", hp='" + hp + '\'' +
                ", yom='" + yom + '\'' +
                ", price=" + price;
    }
}
