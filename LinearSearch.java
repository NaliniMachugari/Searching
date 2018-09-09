package assignment3;

public class LinearSearch {
	public static int linearSearch(int[]a,int b)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b)
			{
				return i;
			}
		}
		return -1;
	}
		public static void main(String[] args){
			int []a={1,2,6,3,7,9};
			int c=linearSearch(a,2);
			System.out.println(c);
		}
}
