package strings.string_class_methods;
// Here it only check the length of the String / Not UPPER and LOWER case
public class EqualsIgnoreCaseMethod {
    public static void main(String[] args) {

        String s1 = "ashok";
        String s2 = "ASHOK";

        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equalsIgnoreCase(s2)); //true
    }
}
