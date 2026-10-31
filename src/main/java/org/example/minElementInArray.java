package org.example;
import java.util.*;
public class minElementInArray {
    public void meth1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int a = sc.nextInt();
        System.out.print("Enter the Array Elements:  ");
        int arr[] = new int[a];
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int min = arr[0];
        for(int x : arr){
            if(x < min){
                min = x;

            }
        }
        System.out.print("The minimum element: " +min);
    }
    public static void main(){
        minElementInArray minimum = new minElementInArray();
        minimum.meth1();
    }

}
