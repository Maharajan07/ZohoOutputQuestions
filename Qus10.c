#include <stdio.h>
#define CUBE(x) x * x * x   // macr expands directly (no brackets)

void solve() {
  int ans = 216 / CUBE(3);

    // 216 / CUBE(3) → 216 / 3 * 3 * 3
    // left to right:
    // 216 / 3 = 72
    // 72 * 3 = 216
    // 216 * 3 = 648
    
  printf("%d", ans);
}

int main() {
  solve();
  return 0;
}

//  648