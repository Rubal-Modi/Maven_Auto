package pac1;

import java.util.Arrays;

public class SquaresofaSortedArray 
{
	 public static int[] sortedSquares(int[] nums) 
	    {
	        int i=0;
	        for(int n:nums)
	        {
	           nums[i]= nums[i]*nums[i] ;
	               i++;
	        }
	        Arrays.sort(nums);
	        for(int j:nums)
	        {
	        	System.out.println(j);
	        }
	        return nums;
	    }

	public static void main(String[] args) 
	{
		int array[]= {-7,-3,2,3,11};
		System.out.println(SquaresofaSortedArray.sortedSquares(array));

	}

}
