#include <iostream>
using namespace std;

int main() {
  // 2D array with 2 rows and 4 columns
  int a[2][4] = {3, 6, 9, 12, 15, 18, 21, 24};
  // a[0] = {3, 6, 9, 12}
  // a[1] = {15, 18, 21, 24}

  cout << *(a[1] + 2)     // a[1] means 2nd row -> {15,18,21,24}
                          // a[1] + 2 means address of 21
                          // *(a[1] + 2) = 21

       << *(*(a + 1) + 2) // (a + 1) means 2nd row
                          // *(a + 1) points to row {15,18,21,24}
                          // +2 → element at index 2 (21)
                          // same as above → 21

       << 2[1[a]];        // 1[a] = a[1] (C++ allows this swap)
                          // 2[a[1]] = a[1][2]
                          // a[1][2] = 21

  return 0;
}

// 212121