package strings.string_class_methods;
// It used to print the String based on index values
public class SubStringMethod {
    public static void main(String[] args) {
        String s1 = "i love india";
        System.out.println(s1.substring(7)); //india
        System.out.println(s1.substring(2)); //love india
        System.out.println(s1.substring(3, 5)); //ov
        System.out.println(s1.substring(6, 7)); //
        System.out.println(s1.substring(0,s1.length()-1)); //i love indi
    }
}
