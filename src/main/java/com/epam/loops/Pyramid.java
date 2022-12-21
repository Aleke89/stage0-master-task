package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for(byte row = 1;row<=cathetusLength;row++){
            for(byte whiteSpaces = (byte) (cathetusLength-row);whiteSpaces>0;whiteSpaces--){
                System.out.print(" ");
            }

            for(byte triangle2 = row;triangle2>0;triangle2--){
                System.out.print(triangle2);
            }
            for(byte triangle3 = 2;triangle3<=row;triangle3++){
                System.out.print(triangle3);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
