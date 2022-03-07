

import java.util.ArrayList;
import java.util.Scanner;

/*
 Day 1 question 2 (Web service)
 developer: Farzaneh Kazemi
 */
public class Day1Q2 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int total = 0;
        int num;
        int max, min;
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Please enter numbers(0 for ending)");
        num = scan.nextInt();
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        while (num != 0) {
            numbers.add(num);
            total += num;
            if (num < min)
                min = num;
            if (num > max)
                max = num;
            num = scan.nextInt();
        }
        if (numbers.size() != 0) {
            for (int i = 0; i <numbers.size() ; i++) {
                if (i !=numbers.size()-1)
                System.out.printf("%d,",numbers.get(i));
                else
                    System.out.printf("%d", numbers.get(i));
            }
            System.out.println("\nTotal= " + total);
            System.out.println("Average= " + total / numbers.size());
            System.out.println("Min= " + min + " Max= " + max);
        }
    }

}
