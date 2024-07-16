package com.cc.java;

public class Cat {
    //Eigenscahften/properties/
    //Felder/ fields/Attributes

    //pass by Reference
    public String name = "Grizabella";
    public String furColor = "White";
     //pass by value
    public int age = 29;






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
