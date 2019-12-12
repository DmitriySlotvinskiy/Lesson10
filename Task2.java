//2*) Дан кирпич со сторонами a,b,c и отверстие со сторонами x,y. Определить пройдет ли кирпич в отверстие.
//Например кирпич со сторонами 2,3,2 не пройдет в отверстие 1x50.

package com.slotvinskiy.lesson10;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        int[] brick1 = {7, 5, 20};
        int[] brick2 = {1, 8, 30};
        int[] brick3 = {7, 9, 10};
        int[][] bricks = {brick1, brick2, brick3};
        int[] hole = {30, 8};
        System.out.println("There is hole with dimensions " + Arrays.toString(hole));
        checkIsBrickFitAndPrint(bricks, hole);
    }

    private static void checkIsBrickFitAndPrint(int[][] bricks, int[] hole) {
        for (int i = 0; i < bricks.length; i++) {
            boolean isFit = isFit(bricks[i], hole);
            if (isFit) {
                System.out.printf("Brick with dimension %s fits.\n", Arrays.toString(bricks[i]));
            } else {
                System.out.printf("Brick with dimension %s doesn't fits.\n", Arrays.toString(bricks[i]));
            }
        }
    }

    private static boolean isFit(int[] brick, int[] hole) {
        Arrays.sort(brick);
        Arrays.sort(hole);
        for (int i = 0; i < hole.length; i++) {
            if (brick[i] > hole[i]) {
                return false;
            }
        }
        return true;
    }
}
