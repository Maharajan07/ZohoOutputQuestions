#include <stdio.h>

void solve() {
  char ch[10] = "abcdefghij";   // ASCII: a=97, b=98, ..., j=106
  int ans = 0;

  for(int i = 0; i < 10; i++) {
            // ch[0] = 'a' (97) → 97 - 97 = 0
            // ch[1] = 'b' (98) → 98 - 97 = 1
            // ch[2] = 'c' (99) → 99 - 97 = 2
            // ...
            // ch[9] = 'j' (106) → 106 - 97 = 9
            
      ans += (ch[i] - 'a');     //  = 0+1+2+3+4+5+6+7+8+9 = 45
  }
  printf("%d", ans); // prints 45
}
int main() {
  solve();
  return 0;
}

//  45