

import java.util.Random;
import java.util.Scanner;
/*
 Day 1 question 4 (Web service)
 developer: Farzaneh Kazemi
 */
public class Day1Q4 {

    static Scanner console = new Scanner(System.in);


    public static void main(String[] args) {
        int maxValue, minValue;
        int numCount;
        System.out.print("How many Random Number do you want?");
        numCount = console.nextInt();
        System.out.print("\nPlease enter the upper bound number");
        maxValue = console.nextInt();
        System.out.print("\nPlease enter the lower bound number");
        minValue = console.nextInt();
        int[]  randomList = new int[numCount];

        for (int i = 0; i <numCount ; i++) {
            randomList[i] = generateRandom(minValue, maxValue);
        }
        System.out.println("List of random nmbers:");
        for (int i = 0; i <numCount; i++) {
            System.out.printf("%d ", randomList[i]);
        }


    }

    private static  int generateRandom(int lowerBound, int upperBound){
        Random rand = new Random();
        int ranNum = rand.nextInt(upperBound) + lowerBound;
        return ranNum;
    }

}
