class Simple {

  public static void main(String[] args) {
      Simple obj = new Simple();
      obj.start();
  }

  void start() {
      long[] P = {3, 4, 5};        // P = [3,4,5]
      long[] Q = method(P);        // Q points to same array as P

      // After method: P = [3,7,5], Q = [3,7,5]

      System.out.print(P[0] + P[1] + P[2] + ":");   // 3+7+5 = 15
      System.out.print(Q[0] + Q[1] + Q[2]);         // 3+7+5 = 15
  }

  long[] method(long[] R) {
      R[1] = 7;   // modifies array (shared reference)
      return R;   // returns same array
  }
}

// 15:15