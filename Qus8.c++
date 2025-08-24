#include <iostream>
using namespace std;

int main()
{
  int p;
  bool a = true;   // a = 1
  bool b = false;  // b = 0
  int x = 10;      // binary: 1010
  int y = 5;       // binary: 0101

  // (x | y) → bitwise OR → 1010 | 0101 = 1111 (decimal 15)

  // (a + b) = 1 + 0 = 1

  p = ((x | y) + (a + b));

  cout << p;       // prints 16
  return 0;
}

//   16