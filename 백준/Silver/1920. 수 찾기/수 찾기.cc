#include <stdio.h>
#include <stdlib.h>

int A[100000];
int B[100000];
int C[100000];

int binary_search_tree(int arr[], int key, int size) {
	int F, R, P;
	F = 0;
	R = size - 1;
    
	while (1) {
		P = (F + R) / 2;
		if (arr[P] == key) return 1;
		if (arr[F] == key) return 1;
		if (arr[R] == key) return 1;

		if (arr[P] < key)
			F = P + 1;
		else
			R = P - 1;
            
		if (F >= R)
			return 0;
	}
}


int CP(const void* a, const void* b) {
	return *(int*)a > * (int*)b ? 1 : (*(int*)a < *(int*)b ? -1 : 0);
}

int main() {
	int N, M;

	scanf("%d", &N);
	for (int i = 0; i < N; i++) {
		scanf("%d", &A[i]);
	}

	scanf("%d", &M);
	for (int i = 0; i < M; i++) {
		scanf("%d", &B[i]);
	}
    

	qsort(A, N, sizeof(int), CP);

	for (int i = 0; i < M; i++) {
		printf("%d\n", binary_search_tree(A, B[i], N));
	}

	return 0;
}
