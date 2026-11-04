package strings.tasks;

import java.util.*;
public class Task5 {
    void meth1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me a String: ");
        String str = sc.nextLine();
        System.out.print("Tell me which index value you want to print: ");
        int ch = sc.nextInt();

        System.out.println("Your String is: "+str);
//        char res = str.charAt(ch);
//        System.out.println(res);
        System.out.println("Printing index value: "+str.charAt(ch));
    }
    public static void main(String[] args){
        Task5 obj = new Task5();
        obj.meth1();
    }
}
