package strings.tasks;
// It is used to change all Lower Case string into Upper Case
import java.util.*;
public class Task3 {
    void meth1(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Give me a String: ");
        String str = sc.nextLine();
        System.out.println("The String is: "+ str);
        System.out.println("String converted into uppercase: "+str.toUpperCase());
    }

    public static void main(String[] args){
        Task3 obj = new Task3();
        obj.meth1();
    }
}
