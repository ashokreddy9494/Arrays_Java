package org.example;

import java.util.Scanner;

public class user_input {
    
    public static void meth1(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int a = sc.nextInt();
        int arr[] =  new int[a];
        System.out.println("Enter the array elements:");
        
        for(int i = 0; i < a;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("The elements are: ");
        for(int i = 0; i < a;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        user_input.meth1();
    }
}
