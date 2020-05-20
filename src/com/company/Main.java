package com.company;

public class Main {
    public static void main(String[] args){
        MyCar vaz = new MyCar("kopeika", 85.7, "white");
        System.out.println(vaz.gas(34));
        System.out.println(vaz.brake(80));
        System.out.println(vaz.description());

        HisCar zaz = new HisCar("gorbatiy", 70, "black");
        System.out.println(zaz.gas(40));
        System.out.println(zaz.brake(80));
        System.out.println(zaz.description());

    }
}
