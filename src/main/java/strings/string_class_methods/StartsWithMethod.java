package strings.string_class_methods;
// Here it checks the start and end index's of the string
public class StartsWithMethod {
    public static void main(String[] args) {
        String s1 = "ashok";
        System.out.println(s1.startsWith("a")); //true
        System.out.println(s1.startsWith("b")); //false
        System.out.println(s1.endsWith("k")); //true
    }
}
