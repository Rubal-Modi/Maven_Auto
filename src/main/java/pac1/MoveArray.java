package pac1;

public class MoveArray 
{
	
	    public void moveZeroes(int[] nums) 
	    {
	        int k= nums.length;
	        int[] array= new int[k];
	        int count=0;
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]!=0)
	            {
	                array[count]=nums[i];
	                count++;
	            }
	        }
	        
	        for(int j=count;j<nums.length;j++)
	        {
	            array[count]= 0;
	        }
	        
	   }

	public static void main(String[] args) 
	{
		


	}

}
