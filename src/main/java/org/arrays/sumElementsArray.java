package org.arrays;
import java.util.*;
public class sumElementsArray {
    public  void sumElements(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the Size of the Array: ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.print("Enter the Array Elements: ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int x: arr){
            sum+=x;
        }
        System.out.println("The sum is "+sum);
    }public static void main(){
        sumElementsArray sum = new sumElementsArray();
        sum.sumElements();
    }
}
