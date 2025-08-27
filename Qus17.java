class Base {
  public static void show() {                 // static method in Base
     System.out.println("Base::show() called");
  }
} 

class Derived extends Base {
  public static void show() {                 // static method in Derived
     System.out.println("Derived::show() called");
  }
} 

class Main {
  public static void main(String[] args) {
      Base b = new Derived();   // reference type = Base, object = Derived
      b.show();                 // static → resolved by reference type
  }
}

// Output: 
//      Base::show() called

// Without static keyword in show()
// ouput:   Derived::show() called
