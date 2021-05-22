#include<stdio.h>
#include<conio.h>
#define MAX 30

void main() {
    int blocks[MAX], files[MAX], temp;
    static int block_frgmnt[MAX], file_frgmnt[MAX], frgmnt[MAX];
    int nb, nf;

    printf("Memory Management Scheme- Worst Fit\n");
    printf("\nEnter the no of blocks:");
    scanf("%d", &nb);

    printf("Enter no files:");
    scanf("%d", &nf);

    printf("Enter size of blocks:-\n");
    for(int i = 0; i < nb; i++) {
        printf("Block %d :", i+1);
        scanf("%d", &blocks[i]);
    }

    printf("Enter the size of files:-\n");
    for(int j = 0; j < nf; j++) {
        printf("File %d :", j+1);
        scanf("%d", &files[j]);
    }

    for(int i = 0; i < nf; i++) {
        for(int j = 0; j < nb; j++) {
            if(block_frgmnt[j] != 1) {
                temp = blocks[j] - files[i];
                if(temp >= 0) {
                    file_frgmnt[i] = j;
                    break;
                } 
            }
        }
        frgmnt[i] = temp;
        block_frgmnt[file_frgmnt[i]] = 1;
    }

    printf("\nFile No: \tFile Size: \tBlock No: \tBlock Size: \tFragment:");
    for(int i = 0; i < nf; i++) {
        printf("\n%d \t\t%d \t\t%d \t\t%d \t\t%d", i+1, files[i], file_frgmnt[i], blocks[file_frgmnt[i]], frgmnt[i]);
    }
}