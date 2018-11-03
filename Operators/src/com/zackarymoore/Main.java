package com.zackarymoore;

public class Main {

    public static void main(String[] args) {
        double firstValue = 20;
        double secondValue = 80;
        double thirdValue = (firstValue + secondValue) * 25;
        System.out.println("thirdValue = " + thirdValue);
        double fourthValue =  thirdValue % 40;
        System.out.println("fourthValue = " + fourthValue);
        if (fourthValue <= 20)
            System.out.println("Total was over the limit");
    }
}
