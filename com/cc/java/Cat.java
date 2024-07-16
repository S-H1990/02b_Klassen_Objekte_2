package com.cc.java;

public class Cat {
    //Eigenscahften/properties/
    //Felder/ fields/Attributes

    //pass by Reference / Encapsulation
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

//Getter
    public String getName() {
        return name;
    }

//Setter
    public void setName(String name) {
        this.name = name;
    }


    public String getFurColor() {
        return furColor;
    }


    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    // Rückgabetyp -- Cat
    public Cat getInstanceVariable(){
        return this;
    }

}
