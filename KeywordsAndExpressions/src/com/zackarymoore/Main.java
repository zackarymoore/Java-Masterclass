package com.zackarymoore;

public class Main {

    public static void main(String[] args) {
        // items under the underscore characters are part of an expression
        //  ___________
        int score = 100;
        //  __________
        if (score > 99) {
            //                 _________________________
            System.out.println("You got the high score!");
          //_________
            score = 0;
        }
    }
}
