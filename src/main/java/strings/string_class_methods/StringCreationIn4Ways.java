package strings.string_class_methods;

public class StringCreationIn4Ways {
    void meth1(){
        // 1. Creating String using String Literal
        String str1 = "java";

        // 2. Creating String using new Keyword
        String str2 = new String("java");

        // 3. Creating Character Array
        char[] str3 = {'j','a','v','a'};

        // 4. Creating String using Character Array with Offset and Count
        //new String(charArray, offset, count);
        //offset + count ≤ array.length
        String s4 = new String(str3, 0, 4);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(s4);
    }
    public static void main(String[] args) {
        StringCreationIn4Ways test = new StringCreationIn4Ways();
        test.meth1();
    }
}
