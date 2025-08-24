#include <stdio.h>

void solve() {
  int x = 2;

  // (x << 1) means left shift by 1 → 2 * 2 = 4
  // (x >> 1) means right shift by 1 → 2 / 2 = 1

  printf("%d", (x << 1) + (x >> 1));
}

int main() {
  solve();
  return 0;
}

// 5