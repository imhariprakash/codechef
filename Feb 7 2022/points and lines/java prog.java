/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		for(int k = 0; k < m; k++){
		    int n = sc.nextInt();
		    int x,y;
		    ArrayList xarr = new ArrayList();
		    ArrayList yarr = new ArrayList();
		    for(int i = 0; i < n; i++){
		        x = sc.nextInt();
		        y = sc.nextInt();
		        if(xarr.contains(x) == false)
		            xarr.add(x);
		        if(yarr.contains(y) == false)
		            yarr.add(y);
		    }
		    System.out.println((xarr.size())+(yarr.size()));
		}
	}
}
