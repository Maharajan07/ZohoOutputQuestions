class Test {
  int count = 0;

  void A() throws Exception {
      try {
          count++; // count = 1
          try {
              count++; // count = 2
              try {
                  count++; // count = 3
                  throw new Exception(); // goes to inner catch
              } catch (Exception ex) {
                  count++; // count = 4
                  throw new Exception(); // goes to outer catch
              }
          } catch (Exception ex) {
              count++; // count = 5
          }
      } catch (Exception ex) {
          count++; // NOT executed (already handled above)
      }
  }

  void display() {
      System.out.println(count);
  }

  public static void main(String[] args) throws Exception {
      Test obj = new Test();
      obj.A();
      obj.display();  // prints 5
  }
}

// 5