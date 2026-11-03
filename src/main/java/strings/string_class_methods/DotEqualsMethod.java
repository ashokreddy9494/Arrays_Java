package strings.string_class_methods;
// It is used to compare the content
// In this Spaces and UPPER and LOWER cases also matters
public class DotEqualsMethod {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        String s4 = new String ("java");
        System.out.println(s1.equals(s1));
        s1 = "JAVA";

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s1));
    }
}
