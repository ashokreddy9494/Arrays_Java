package org.arrays;

import java.util.Scanner;

public class user_input {

    public static void meth1(){

        System.out.println("Give me the size of the Array");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter the Array Elements");
        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Array Elements");
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");

        }
    }

    public static void main(String[] args) {

        user_input.meth1();

    }
}
