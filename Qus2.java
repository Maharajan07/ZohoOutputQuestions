public class Qus2 {
    public static void main(String[] args) {
        String str = "Java";
        str = str.substring(0, 3).concat("def");    //  Javdef

        str = str.replace('a', 'z').concat("Script");   //  JzvdefScript

        System.out.println(str);    //  JzvdefScript
    }
}
