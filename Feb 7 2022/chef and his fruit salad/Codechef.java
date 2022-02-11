/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
		    int ban = sc.nextInt();
		    int app = sc.nextInt();
		    int res = (int)ban/2;
		    if(res > app)   
		        res = app;
		    System.out.println(res);
		}
		
		sc.close();
	}
}
