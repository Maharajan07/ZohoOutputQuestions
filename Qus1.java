public class Qus1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java"); 
        sb.append(" Programming");  // "Java Programming"
        sb.delete(4, 6);    // 4-inclusive, 6-exclusive
        System.out.print(sb); 
    } 
}

//  Javarogramming