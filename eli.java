#include <stdio.h>
#include <string.h>

int main() {
    char Str1[5], Str2[5];
    int 1, j, k;

    printf("Enter the first String : ");
    gets(Str1);

    printf("Enter the second String : ");
    gets(Str2);

    i = 0;

    while(Str1[i]!='\0') {
        i++;
    }

    j = 0;
    while(Str2[j]!='\0') {
        Str1[i] = Str2[j]
        i++;
        j++;
    }

    Str1[i] = '\0'

    printf("String after the Concatenation =%s", Str1);
    return 0;
}