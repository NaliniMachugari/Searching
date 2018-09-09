package assignment3;
import java.util.*;
public class BinarySearch {
	public static int binarySearch(int []a)
	{
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter a number to search");
	int n=obj.nextInt();
		int last=a.length-1;
		int first=0;
		int middle=(first+last)/2;
		while(first<=last)
		{
			if(a[middle]<n)
			{
				first=middle+1;
			}
			else if(a[middle]==n)
			{
				//System.out.println("number found"+a[middle]);
				return middle;
			}
			else
			{
				last=middle-1;
			}
			middle=(first+last)/2;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={15,10,5,20,25,30,45,50};
		int t=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		int b=binarySearch(a);
			System.out.println(b);
	}	
}
