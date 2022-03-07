

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = new int[]{4, 5, 6, 7};

        int[] resultConcat = concat(arr1, arr2);
        print(resultConcat);
        System.out.println();

        int[] arr3 = {1, 2, 3, 5, 7};
        int[] arr4 = new int[]{4, 5, 6, 7};
        printDups(arr3, arr4);

    }

    public static int[] concat(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int counter = 0;
        for (int n : first) {
            result[counter] = n;
            counter++;
        }
        for (int n : second) {
            result[counter] = n;
            counter++;
        }
        return result;
    }

    // print duplicate
    public static void printDups(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.printf("%d ", arr1[i]);
                    break;
                }
            }

        }
    }

    public static int[] removeDuplicate(int[] arr1, int[] arr2) {
        int[] noDuplicates = new int[arr1.length];
        int noDupCount = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean isDup = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    //I want to skip this one !!!
                    isDup = true;
                    break; // no need to continue
                }
            }
            //check if it is not seen
            if (!isDup) {
                noDuplicates[noDupCount++] = arr1[i];
            }
        }
        //if I return noDuplicates, it will return 0 for some of the elements that are not filled in line 87

        int[] result = new int[noDupCount];
        for (int i = 0; i < noDupCount; i++) {
            result[i] = noDuplicates[i];
        }
        return result;
    }

    public static void print(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        for (int num : arr) {
            System.out.printf("%d ", num);
        }
    }
}

