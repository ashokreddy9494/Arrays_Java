package strings.string_class_methods;
// It is used to remove the white spaces at starting and ending of the string (Not in between the words)
public class TrimMethod {
    public static void main(String[] args) {
        String s1 = "   java   ";
        String s2 = " java script ";

        System.out.println("s1 length before trim: " + s1.length()); //10
        System.out.println("s1 length after trim: " + s1.trim().length()); //4
        System.out.println("s1 length after trim: " + s2.length()); //13
        System.out.println("s1 length after trim: " + s2.trim().length()); //11

    }
}
