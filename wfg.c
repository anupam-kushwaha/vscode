#include<stdio.h>

void main()
{
    int allocMat[20][20];
    int reqMat[20][20];
    int wfgMat[20][20];
    int i, j;
    int no_p, no_r;
    
    printf("\nEnter no of process:");
    scanf("%d", &no_p);
    
    printf("\nEnter no of resources:");
    scanf("%d", &no_r);
    
    printf("\nEnter values for allocation Matrix:\n");
    for(i = 0; i < no_p; i++)
    {
        for(j = 0; j < no_r; j++)
        {
            printf("Is P[%d] <-- R[%d] :", i+1, j+1);
            scanf("%d", &allocMat[i][j]);
            printf("\n");
        }
    }
    
    printf("\nEnter values for request Matrix:\n");
    
    for(i = 0; i < no_p; i++)
    {
        for(j = 0; j < no_r; j++)
        {
            printf("Is P[%d] --> R[%d] :", i+1, j+1);
            scanf("%d", &reqMat[i][j]);
            printf("\n");
        }
    }
    
    printf("\nALLOCATION MATRIX:\n");
    for(i = 0; i < no_p; i++)
    {
        for(j = 0; j < no_r; j++)
        {
            printf("%d  ",allocMat[i][j]);
        }
        printf("\n");
    }   
   
}