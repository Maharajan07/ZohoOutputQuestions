#include <iostream>

using namespace std;

void square(int *x, int *y)
{
  *x = (*x) * --(*y);   //    *x = (30)* (29)

  //    *x = 870
}

int main()
{
  int number = 30;
  square(&number, &number); // call by reference
  
  cout << number;   //870
  return 0;
}

//  870