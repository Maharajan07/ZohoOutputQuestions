class Base {
    final public void show() {          //  final method -> cannot be overridden in subclass
        System.out.println("Base::show() called");
    }
}

class Derived extends Base {
    //  Trying to override final method
    public void show() {                 //   Compilation error: cannot override final method from Base
        System.out.println("Derived::show() called");
    }
}

class Main {
    public static void main(String[] args) {
        Base b = new Derived();   // Reference of Base, object of Derived
        b.show();                 // Compilation fails before reaching here
    }
}

//  Output:
//      Compilation Error