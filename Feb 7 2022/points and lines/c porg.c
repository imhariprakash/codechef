#include <stdio.h>

int canIAdd(int array[],int n,int ele){
    if(n == 0){
        return(1);
    }
    for(int i = 0; i < n; i++){
        if(array[i] == ele){
            return 0;
        }
    }
    return(1);
}


int main(void) {
        int m;
        scanf("%d",&m);
        for(int k =0; k < m; k++){
        	int n,i,x,y,xele=0,yele=0;
        	scanf("%d",&n);
        	int xarr[n],yarr[n];
        	for(i = 0; i < n; i++){
        	    scanf("%d",&x);
        	    scanf("%d",&y);
        	    if(n == 1){
        	        xele = 1;
        	        yele = 1;
        	        break;
        	    }
        	    if(canIAdd(xarr,xele,x)){
        	        xarr[xele] = x;
        	        xele++;
        	    }
        	    if(canIAdd(yarr,yele,y)){
        	        yarr[yele] = y;
        	        yele++;
        	    }
        	    //printf("%d %d\n",xele,yele);
    	}
    	printf("%d\n",(xele + yele));
    }
return 0;
}

