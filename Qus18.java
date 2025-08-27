abstract class demo {
  public int a;
  demo() {               // constructor sets a = 10
      a = 10;
  }

  abstract public void set();     //    ERROR: abstract method must have same signature in subclass
  abstract final public void get(); //  ERROR: abstract + final not allowed
}

class Test extends demo {
  //    ERROR: method signature mismatch
  //    parent has set() with no args, here it is set(int a)
  public void set(int a) {
      this.a = a;
  }

  //    ERROR: parent had abstract final (illegal)
  //    even if it was only abstract, overriding is allowed
  final public void get() {
      System.out.println("a = " + a);
  }

  public static void main(String[] args) {
      Test obj = new Test();
      obj.set(20);
      obj.get();
  }
}

//  Compilation Error