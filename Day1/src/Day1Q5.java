

import java.util.Scanner;
/*
 Day 1 question 5 (Web service)
 developer: Farzaneh Kazemi
 */
public class Day1Q5 {
     static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        String star = "*";
        System.out.println("How many line of start do you want to print?");
        num = console.nextInt();
        for (int i = 1; i<= num  ; i++) {
            System.out.println(star.repeat(i));
            
        }
        for (int i = num+1; i>0  ; i--) {
            System.out.println(star.repeat(i));

        }
    }
}
