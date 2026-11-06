package strings.tasks;
import java.util.Scanner;
public class Task6 {
    void meth1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Your String is: "+str);
        System.out.print("Enter another string: ");
        String str2 = sc.nextLine();
        System.out.println("Your String is: "+str2);

        System.out.println("Checking both strings: "+str.equals(str2));
    }
    public static void main(String[] args){
        Task6 obj = new Task6();
        obj.meth1();
    }
}
