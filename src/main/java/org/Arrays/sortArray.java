package org.Arrays;
import java.util.*;
public class sortArray {
    public void easySort(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
    }



    public static void main(String[] args){
        sortArray obj = new sortArray();
        obj.easySort();
    }
}
