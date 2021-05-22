#include<stdio.h>

int main()
{
	int allocMat[20][20];
	int maxMat[20][20];
    int avail[20];
	int i, j , k;
	int no_p, no_r; // number of processs and number of resources.
	
	printf("Enter no of Process:");
	scanf("%d", &no_p);
	
	printf("Enter no of Resources:");
	scanf("%d", &no_r);

	int needMat[no_p][no_r];
	int flag[no_p], safeSeq[no_p], count = 0;

	for(int i = 0; i < no_p; i++){
		flag[i] = 0;
	}
	

	printf("\nEnter values for allocation Matrix\n");
	for(i = 0; i < no_p; i++)
	{
		printf("\nFor Process P[%d] \n", i+1);
		for(j = 0; j < no_r; j++)
		{
			printf("Allocated Instances of R[%d] :", j+1);
			scanf("%d", &allocMat[i][j]);
		}
	}
	
	printf("\nEnter values for maximum Matrix\n");
	for(i = 0; i < no_p; i++)
	{
		printf("\nFor process P[%d] \n", i+1);

		for(j = 0; j < no_r; j++)
		{
			printf("Maximum instances required of R[%d] :", j+1);
			scanf("%d", &maxMat[i][j]);
		}
	}

	printf("\nEnter the value for available Array:\n");
	for(i = 0; i < no_r; i++){
		printf("R[%d] :", i+1);
		scanf("%d", &avail[i]);
	}
	

	for(int i = 0; i < no_p; i++) {
		for(int j = 0; j < no_r; j++) {
			needMat[i][j] = maxMat[i][j] - allocMat[i][j];
		}
	}
	

	int y = 0;
	for(k = 0; k < no_p; k++) {
		for(i = 0; i < no_p; i++) {
			if(flag[i] == 0) {
				int f = 0;

				for(j = 0; j < no_r; j++){
					if(needMat[i][j] > avail[j]) {
						f  = 1;
						break;
					}
				}

				if(f == 0) {
					safeSeq[count++] = i+1;
					for(y = 0; y < no_r; y++) {
						avail[y] += allocMat[i][y];
					}
					flag[i] = 1;
				}// inner if
			}//outer if
		}// for(i)
	}//for(k)

	printf("\nSAFE Sequence is : ");

	for(i = 0 ; i < no_p - 1; i++) {
		printf("P[%d]->", safeSeq[i]);
	}
	printf("P[%d]", safeSeq[no_p - 1]);
}