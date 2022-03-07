

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*
 Day 1 question 3 (Web service)
 developer: Farzaneh Kazemi
 */
public class Day1Q3 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<String>  listOfNames = new ArrayList<>();

        String line = console.nextLine();
        while(true){
            if (line.equals("")){
                break;
            }
            String[] names = line.split("\\s+");
            listOfNames .addAll(Arrays.asList(names));
            line = console.nextLine();
        }
        for (String name : listOfNames)
        System.out.printf("%s ",name); //
       //sd System.out.println(allNames);
    }
}
