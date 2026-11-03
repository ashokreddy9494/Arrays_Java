package revision;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number: ");
        int b = sc.nextInt();
        System.out.print("Enter the Third Number: ");
        int c = sc.nextInt();

//        int smallest = (a<b) ? ((a > b) ? (a) : b) : c;
        int smallest = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        System.out.print("Smallest Number: " + smallest);
        sc.close();
    }
}
