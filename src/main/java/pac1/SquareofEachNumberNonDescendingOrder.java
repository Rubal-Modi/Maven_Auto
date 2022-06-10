package pac1;

public class SquareofEachNumberNonDescendingOrder 
{
	public int[] sortedSquares(int[] nums) 
	{
		for(int i=0;i<nums.length;i++)
		{
			nums[i]= nums[i]* nums[i];
		}
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				int temp=0;
				if(nums[i]>nums[j])
				{
					temp= nums[i];
					nums[i]=nums[j];
					nums[j]= temp;
				}
			}
		}
		
        return nums;
    }
	public static void main(String args[])
	{
		SquareofEachNumberNonDescendingOrder object = new SquareofEachNumberNonDescendingOrder();
		int array[]= {-4,-1,0,3,10};
		System.out.println(object.sortedSquares(array));
	}

}
