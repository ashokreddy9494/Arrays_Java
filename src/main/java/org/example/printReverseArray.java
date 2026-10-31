package org.example;
import java.util.Scanner;
public class printReverseArray {
    public void meth1(){
         Scanner sc = new Scanner(System.in);
         System.out.print("Give the Size of the Array: ");
         int a = sc.nextInt();
         System.out.print("Give the Elements for the Array: ");
         int arr[] = new int[a];
         for(int i = 0;i < arr.length;i++){
             arr[i] = sc.nextInt();
         }

         for(int i = arr.length-1; i>=0;i--) {
             System.out.print(arr[i] + " ");
         }
    }
    public static void main(String[] args) {
        printReverseArray obj = new printReverseArray();
        obj.meth1();
    }
}
