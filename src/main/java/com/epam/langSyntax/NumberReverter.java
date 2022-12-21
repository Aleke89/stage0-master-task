package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int last = number%10;
        int ortasy = number/10%10;
        int first = number/100;
        System.out.println(Integer.parseInt(last+""+ortasy+""+first));
    }

}
