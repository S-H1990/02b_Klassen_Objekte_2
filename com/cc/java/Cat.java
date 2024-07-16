package com.cc.java;

public class Cat {
    //Eigenscahften/properties/
    //Felder/ fields/Attributes

    //pass by Reference
    private String name = "Grizabella";
    private String furColor = "White";
     //pass by value
    private int age = 29;


// Konstruktor (keinen Rückgabetyp )
    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }


    // Rückgabetyp -- Cat
    public Cat getInstanceVariable(){
        return this;
    }

}
