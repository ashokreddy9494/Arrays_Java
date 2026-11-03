package strings.string_class_methods;
// Used to compare the address of the memory location of the string
// Output will be in Boolean only
public class DoubleEqualsMethod {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        String s4 = new String ("java");;

        System.out.println(s1 == s2); //true
        System.out.println(s2 == s4); //false
    }
}
