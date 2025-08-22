class Test {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.start();
    }
    void start() {
        String stra = "do";
        String strb = method(stra); // " good"
        System.out.print(": " + stra + strb);
    }
    String method(String stra) { //call by value
        stra = stra + "good";
        System.out.print(stra); // "dogood"
        return " good";
    }
}


//     dogood: do good