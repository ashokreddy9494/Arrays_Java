package strings.string_class_methods;
//It used to print the index value of the string
public class CharAtMethod {
    public static void main(String[] args) {
        String s1 = "ee sala cup namde";
        System.out.println(s1.charAt(3)); //s
        System.out.println(s1.charAt(10)); //p
        System.out.println(s1.charAt(20)); //StringIndexOutOfBoundsException
    }
}
