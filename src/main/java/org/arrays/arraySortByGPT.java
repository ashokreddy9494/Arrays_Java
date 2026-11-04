package org.arrays;
import  java.util.*;

public class arraySortByGPT {
    static Scanner sc = new Scanner(System.in);

    // 1. Automatic Ascending Sort
    public void autoAscendingSort() {

        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Ascending Order: " + Arrays.toString(arr));
    }


    // 2. Automatic Descending Sort
    public void autoDescendingSort() {

        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();

        Integer[] arr = new Integer[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Descending Order: " + Arrays.toString(arr));
    }


    // 3. Manual Ascending Sort (Selection Sort)
    public void ascendingSort() {

        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println("Ascending Order: " + Arrays.toString(arr));
    }


    // 4. Manual Descending Sort (Selection Sort)
    public void descendingSort() {

        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {

            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        System.out.println("Descending Order: " + Arrays.toString(arr));
    }


    public static void main(String[] args) {

        arraySortByGPT obj = new arraySortByGPT();

        obj.autoAscendingSort();
        obj.autoDescendingSort();
        obj.ascendingSort();
        obj.descendingSort();

        sc.close();
    }
}
