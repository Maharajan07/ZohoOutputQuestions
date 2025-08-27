class Test {
  static int a;

  // static block runs once when class loads
  static {
      a = 4;
      System.out.println("inside static block"); // runs first
      System.out.println("a = " + a);
  }

  Test() {  // constructor
      System.out.println("inside constructor");
      a = 10;  // updates a to 10
  }

  public static void func() {
      a = a + 1;                // a = 10 + 1 = 11
      System.out.println("a = " + a);
  }

  public static void main(String[] args) {
      Test obj = new Test();    // calls constructor
      obj.func();               // calls func()
  }
}

//output:
//  inside static block
//  a = 4
//  inside constructor
//  a = 11