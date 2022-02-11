#include <stdio.h>

int main() {
	int n,i,N,x,j,count;
	scanf("%d",&n);
	for(i = 0; i < n; i++){
	    scanf("%d",&N);
	    scanf("%d",&x);
	    count = 0;
	    for(j = 0; j < x; j++){
	        count++;
	        if(count > N)
	            count = 0;
	    }
	    printf("%d\n",count);
	}
	return 0;
}