

import java.util.ArrayList;
import java.util.Scanner;

public class Day1Q1 {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 6, 8};
        int[] arr2 = new int[]{2, 3, 9, 10, 5};
        printArray(concatArray(arr1, arr2));
        System.out.println();
        printDups(arr1, arr2);
        System.out.println("\n array 1");
        printArray(arr1);
        System.out.println("\nremove duplicate");
        printArray(removeDups(arr1, arr2));


    }

    private static int[] concatArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int counter = 0;
        for (int num : arr1) {
            arr3[counter] = num;
            counter++;
        }
        for (int num : arr2) {
            arr3[counter] = num;
            counter++;
        }
        return arr3;
    }

    private static int[] findDups(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr3;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    list.add(arr1[i]);
                    break;
                }
            }
        }
        arr3 = list.stream().mapToInt(Integer::intValue).toArray();
        return arr3;
    }

    private static void printDups(int[] arr1, int[] arr2) {
        int[] arr3 = findDups(arr1, arr2);
        printArray(arr3);

    }

    private static void printArray(int[] arr1) {
        for (int n : arr1) {
            System.out.printf("%d ", n);
        }
    }

    private static int[] removeDups(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];
        int counter = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean isDups = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    isDups = true;
                    break;
                }
            }
            if (!isDups) {
                arr3[counter] = arr1[i];
                counter++;
            }

        }
        int[] result = new int[counter];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr3[i];
        }
        return result;

    }

}
