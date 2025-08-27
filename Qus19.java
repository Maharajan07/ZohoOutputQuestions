final class Complex {   // final class means it cannot be extended (no subclassing allowed)
  private final double re;   // final variables, value cannot be reassigned after initialization
  private final double im;

  public Complex(double re, double im) {   // constructor to initialize values
      this.re = re;
      this.im = im;
  }

  public String toString() {   // while printing object (c), this method (toString();) will automatically called
      return "(" + re + " + " + im + "i)";
  }
}

class Main {
  public static void main(String args[]) {
      Complex c = new Complex(10, 15);   // object creation
      System.out.println("Complex number is " + c);  // calls toString() implicitly
  }
}

//  Output:
//         Complex number is (10.0 + 15.0i)
