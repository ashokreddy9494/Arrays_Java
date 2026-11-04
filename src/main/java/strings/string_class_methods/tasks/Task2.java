package strings.string_class_methods.tasks;
//It is used to check the length of the string
import java.util.*;
public class Task2 {
    void meth1(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Give me a String: ");
        String str = sc.nextLine();
        System.out.println("Your string is: "+str);
        System.out.println("Your string length is: " + str.length());
    }
    public static void main(String[] args){
        Task2 obj = new Task2();
        obj.meth1();
    }
}
