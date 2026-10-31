package org.example;
import java.util.*;
public class printHighestElementInArray {

    public void meth1(){

        System.out.print("Give me the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.print("Enter the Array Elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        System.out.print("Higest element int Array: ");
        for(int i = 0;i < arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The maximum element is "+max);
    }
    public static void main(){
        printHighestElementInArray max = new printHighestElementInArray();
        max.meth1();
    }
}
