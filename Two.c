#include <stdio.h>

int main() {
    int x = 3;
    if (x == 2) x = 8;
    if (x == 3) x++;
    else x += 6;
    printf("%d", x);
    return 0;
}

// Output:
//      4