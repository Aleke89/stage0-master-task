package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    public String getDescription(){
        if(numberOfPaws!=1 && hasFur==true){
            return "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and a fur.";
        }else if(numberOfPaws==1 && hasFur==true){
            return "This animal is mostly " + color + ". It has " + numberOfPaws + " paw and a fur.";
        }else if(numberOfPaws!=1 && hasFur==false){
            return "This animal is mostly " + color + ". It has " + numberOfPaws + " paws and no fur.";
        }else return "This animal is mostly " + color + ". It has " + numberOfPaws + " paw and no fur.";
    }
}
