package org.Arrays;
import java.util.*;
public class second_maximum {

    public void meth1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me the size of the Array: ");
        int a = sc.nextInt();
        System.out.print("Give the Array Elements: ");
        int arr[] = new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        // Find maximum element
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        // Find second maximum element
        for(int i=0;i<arr.length;i++){
            if(arr[i] < max && arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        if(secondMax ==  Integer.MIN_VALUE){
            System.out.println("The maximum is "+max);
        }
        else{
            System.out.println("The second max is "+secondMax);
        }

    }
    public static void main(String[] args){
        second_maximum obj = new second_maximum();
        obj.meth1();
    }
}
