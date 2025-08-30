#include <stdio.h>

enum Status { SUCCESS, FAILURE };
enum Status checkStatus(int value) {
    return (value % 2 == 0) ? SUCCESS : FAILURE; // Success - 0, Failure - 1
}

int main() {
    int num = 3;
    enum Status result = checkStatus(num);
    printf("%d\n", result);
    return 0;
}

// Output:
//      1