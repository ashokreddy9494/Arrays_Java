package org.Arrays;
import java.util.*;
public class sortArray {
    public void autoAscendingSort(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int a = sc.nextInt();
        System.out.print("Enter the Elements to Array: ");
        int arr[] = new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
    }

    public void autoDescendingSort(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int a = sc.nextInt();
        System.out.print("Enter the Elements to Array: ");
        int arr[] = new int[a];
        for(int i = 0;i < arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    public void AscendingSort(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int a = sc.nextInt();
        System.out.print("Enter the Elements to Array: ");
        int arr[] = new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("Sorted Array in Ascending Order: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public void descendingSort(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int a = sc.nextInt();
        System.out.print("Enter the Elements to Array: ");
        int arr[] = new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i < arr.length;i++){
            for(int j = i+1; j < arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted Array in Descending Order: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        sortArray obj = new sortArray();

        obj.autoAscendingSort();
        obj.autoDescendingSort();
        obj.AscendingSort();
        obj.descendingSort();

    }
}
