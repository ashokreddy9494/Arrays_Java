package strings.tasks;
import java.util.*;
public class Task7 {
    void meth1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter another string: ");
        String str2 = sc.nextLine();

        System.out.print("Checking both strings: "+str1.equalsIgnoreCase(str2));
    }
    public static void main(String[] args){
        Task7 obj = new Task7();
        obj.meth1();
    }
}
