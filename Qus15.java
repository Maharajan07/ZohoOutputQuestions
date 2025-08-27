class Test {
  public static void main (String[] args) {
      int arr1[] = {1, 2, 3};
      int arr2[] = {1, 2, 3};

      // arr1 and arr2 are 2 different objects in memory
      // "==" checks reference (address), not contents

      // use Arrays.equals(arr1, arr2) to compare contents

      if (arr1 == arr2)                       
          System.out.println("Same");
      else
          System.out.println("Not same");
  }
}

//  Not same
