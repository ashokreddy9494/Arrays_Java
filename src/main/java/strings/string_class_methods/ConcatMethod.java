package strings.string_class_methods;
// until we store it we in a variable / we can't get new value as output
public class ConcatMethod {
    public static void main(String[] args) {
        String s1 = "java";
        System.out.println(s1); //java

        s1.concat(" script");
        System.out.println(s1); //java

        String s2 = "java";
        System.out.println(s2); //java

        s2 = s2.concat(" script");
        //OR s2 = s2 + " script";
        System.out.println(s2); //java script
    }
}
