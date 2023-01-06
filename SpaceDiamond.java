package com.jsp.Patternspack;

import java.util.Scanner;

public class SpaceDiamond 
{
	public static void main(String []args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("ENTER THE SIZE");
		int n=scn.nextInt();
		
		int l=n/2;
		int s=1;
		
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=l;j++)
			{
				System.out.print("X");
			}
			for (int j=1;j<=s;j++)
			{
				System.out.print(" ");
				
			}
			for (int j=1;j<=l;j++)
			{
				System.out.print("X");
			}
			
				System.out.println();
				if(i<=n/2) {
					s+=2;
					l--;
				}else {
					s-=2;
					l++;
				}
			
		}
	}


}
