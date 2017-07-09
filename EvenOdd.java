import java.util.*;
import java.lang.*;
import java.io.*;
class EvenOdd{
	public static void main(String[] args)throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the variable");
		int var=sc.nextInt();
		if(var%2==0){
			System.out.println("Even Number");
		}
		else if(var%2!=0){
			System.out.println("odd Number");
		}
	}
}
