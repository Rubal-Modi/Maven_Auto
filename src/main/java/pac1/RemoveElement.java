package pac1;

public class RemoveElement 
{
	    public static int removeElement(int[] nums, int val)
	    {
	    	int k=nums.length;
	        int position=nums.length-1;
	        int temp;
	         for(int i=nums.length-1;i>=0;i--)
	        {
	            if(nums[i]==val && i==nums.length-1)
	            {
	                k--;
	                position--;
	            }
	            if(nums[i]==val)
	            {
	                 temp= nums[i];
		             nums[i]= nums[position];
		            nums[position]=temp;
	                 k--;
	                 position--;
	            }
	            
	        }
	        return k;  
	    }
	public static void main(String[] args) 
	{
		int array[]= {0,1,2,2,3,0,4,2};
		System.out.println(RemoveElement.removeElement(array, 2));
		

	}

}
