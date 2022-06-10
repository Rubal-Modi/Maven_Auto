
public class FindMaxMin
{
	public static void maxmin(int [] nums)
	{
    int max= Integer.MIN_VALUE;
    int min= Integer.MAX_VALUE;
    int i=0;
    while(i<nums.length)
    {
    	if(nums[i]>max)
    	{
    		max=nums[i];
    	}
    	if(nums[i]<min)
    	{
    		min=nums[i];
    	}
    		i++;
    }
    System.out.println(max);
    System.out.println(min);
	}

	public static void main(String[] args)
	{
		int array[]= {1,2,3,5,8,9,3,5,7};
		FindMaxMin.maxmin(array);



	}

}
