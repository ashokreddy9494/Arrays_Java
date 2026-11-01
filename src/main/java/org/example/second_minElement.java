package org.example;

import java.util.Scanner;

public class second_minElement {
    public void meth1(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Give me the size of the Array: ");
        int a = sc.nextInt();
        System.out.print("Give the Elements to Array: ");
        int arr[] = new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int min = arr[0];
        int secondMin = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        for(int i = 0; i<arr.length;i++){
            if(arr[i] > min && arr[i]<secondMin){
                secondMin = arr[i];
            }
        }
        if(secondMin == Integer.MAX_VALUE){
            System.out.println("There is no Second Min Element in the Array");
        }
        else{
            System.out.println("The Second Min Element: "+secondMin);
        }
    }
    public static void main(String[] args) {
        second_minElement obj=new second_minElement();
        obj.meth1();
    }
}
