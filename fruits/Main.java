package com.slotvinskiy.lesson10.fruits;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Fruit[] fruits = new Fruit[4];


        Fruit lemon = new Fruit();
        lemon.setType(FruitType.LEMON);
        lemon.setColor(Color.YELLOW);
        lemon.setWeightGram(152);
        lemon.setPricePerKg(41.90);
        System.out.println("Lemon price: " + lemon.getPrice());

        Fruit banana = new Fruit(FruitType.BANANA, Color.YELLOW, 176, 27.00);
        System.out.println("Banana price: " + banana.getPrice());
        System.out.println("Banana color: " + banana.getColor());

        Fruit redApple = new Fruit(274, 14.90);
        System.out.println("Red Apple price: " + redApple.getPrice());

        Fruit greenApple = new Fruit (158, 16.9);
        System.out.println("Green apple price is " + greenApple.getPrice());

        fruits[0] = lemon;
        fruits[1] = banana;
        fruits[2] = redApple;
        fruits[3] = greenApple;
        System.out.println(Arrays.toString(fruits));

        double  total = 0;
        for (int i = 0; i < fruits.length; i++) {
            total += fruits[i].getPrice();
        }
        System.out.println("Total price is: " + total);






    }

}
