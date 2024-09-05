#include<stdio.h>

int isPrime(int num);

int main() {
    int n, i;

    printf("Enter a positive integer: ");
    scanf("%d", &n);

    printf("Prime numbers between 1 and %d are: \n", n);
    for (i = 2; i <= n; i++) {
        if (isPrime(i)) {
            printf("%d\n", i);
        }
    }

    return 0;
}

int isPrime(int num) {
    int i;
    if (num < 2)
        return 0;
    for (i = 2; i * i <= num; i++) {
        if (num % i == 0)
            return 0;
    }
    return 1;
}
