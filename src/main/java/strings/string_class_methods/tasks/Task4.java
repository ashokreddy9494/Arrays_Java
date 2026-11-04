package strings.string_class_methods.tasks;
// It is used to change all Upper Case string into Lower Case
import java.util.*;
public class Task4 {
    void meth1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give me a String: ");
        String str = sc.nextLine();
        System.out.println("Your String is: "+str);
        System.out.println("String is changing into Lower Case: "+str.toLowerCase());
    }
    public static void main(String[] args){
        Task4 obj = new Task4();
        obj.meth1();

    }
}
