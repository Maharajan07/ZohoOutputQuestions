public class Qus4 {
    public static void main(String[] args) {
        String str1 = "abcdef"; // goes to string pool

        String str2 = str1.substring(3,6);  //  creates New object in Heap("def")
        String str3 = "def";    //  from string pool

        System.out.println(str2 == str3);  //   different references 
    }
}

//  false

// using '.quals()' -> System.out.println(str2.equals(str3)); - true