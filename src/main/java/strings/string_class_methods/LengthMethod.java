package strings.string_class_methods;
// It will only checks the length of the string
public class LengthMethod {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "JAVA";
        String s3 = "java script";

        System.out.println("length of the s1: " + s1.length());
        System.out.println("length of the s2: " + s2.length());
        System.out.println("length of the s3: " + s3.length());

        System.out.println(s1.length() == s2.length());
        System.out.println(s2.length() == s3.length());
    }
}
