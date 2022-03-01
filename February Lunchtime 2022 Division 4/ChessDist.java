/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ChessDist
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
		    int x1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int y1 = sc.nextInt();
		    int y2 = sc.nextInt();
		    int ans1 = Math.max(Math.abs(x1 - y1), Math.abs(x2 - y2));
		    System.out.println(ans1);
		}
	}
}
