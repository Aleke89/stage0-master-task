package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for(byte row = 1;row<=cathetusLength;row++){
            for(byte whiteSpaces = (byte) (cathetusLength-row);whiteSpaces>0;whiteSpaces--){
                System.out.print(" ");
            }
            for(byte triangle2 = row;triangle2>0;triangle2--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
