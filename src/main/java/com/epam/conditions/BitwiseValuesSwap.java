package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {
        System.out.println((first^second)+first);
        System.out.println((second^first)+first-first^second);
        first = first^second;
    }

}
