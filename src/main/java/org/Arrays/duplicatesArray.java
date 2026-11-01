package org.Arrays;
import java.util.*;
public class duplicatesArray {


    public void meth1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int a = sc.nextInt();
        System.out.print("Enter the elements in the array: ");
        int arr[] = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){

            boolean duplicate = false;

            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    duplicate=true;
                    break;
                }
            }
            if(duplicate==false){
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        duplicatesArray obj = new duplicatesArray();
        obj.meth1();
    }
}
