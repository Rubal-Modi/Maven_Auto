
public class ReverseArray 
{
	//first method
	public static int[] reverse(int[] nums)
	{
		int j=0;
		int array[]=new int[nums.length];
		if(nums.length==1)
		{
			return nums;
		}
		for(int i=nums.length-1;i>=0;i--)
		{
			array[j]= nums[i];
			j++;
		}
		return array;
	}
	public static int[] reversearray(int [] nums)
	{
		int x=0;int temp;
		int y= nums.length-1;
		while(x<y)
		{
		temp= nums[x];
		nums[x]= nums[y];
		nums[y]= temp;
		x++;
		y--;
		}
		return nums;
	}

	public static void main(String[] args) 
	{
	    int inputarray[]= {1,4,7,9,3,6,9,5,0,1,2};
	    int outputArrayMethod1[]= reverse(inputarray);
	    int outputArrayMethod2[]= reversearray(inputarray);
	    for(int i=0;i<inputarray.length;i++)
	    {
	    	System.out.print(outputArrayMethod2[i]+ ",");
	    }

	}

}
