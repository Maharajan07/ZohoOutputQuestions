#include <stdio.h>

void solve() {
  int a[] = {1, 2, 3, 4, 5};
  int sum = 0;

  for(int i = 0; i < 5; i++) {
      if(i % 2 == 0) {          // even index
          sum += *(a + i);      // add element
      } else {                  // odd index
          sum -= *(a + i);      // subtract element
      }
  }

        // step by step:
        // i=0 → sum = 0+1 = 1
        // i=1 → sum = 1-2 = -1
        // i=2 → sum = -1+3 = 2
        // i=3 → sum = 2-4 = -2
        // i=4 → sum = -2+5 = 3

  printf("%d", sum); // prints 3
}

int main() {
  solve();
  return 0;
}

// 3