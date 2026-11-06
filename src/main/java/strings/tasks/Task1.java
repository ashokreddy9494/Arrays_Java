package strings.tasks;
import java.util.*;
public class Task1 {
    void meth1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s1 = sc.nextLine();
        System.out.println("This your string: "+s1);
    }
    public static void main(String[] args) {
        Task1 obj = new Task1();
        obj.meth1();
    }
}
