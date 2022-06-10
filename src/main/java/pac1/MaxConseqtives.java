package pac1;

public class MaxConseqtives
{
	public int findMaxConsecutiveOnes(int[] nums) 
	    {
			int length= nums.length;
	        int count=0;
	        int max=0;
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]==1)
	            {
	                count++;
	            }
	            if(nums[i]==0)
	            {
	                if(count>max)
	                {
	                	max=count;
	                }
	                count=0;
	            }
	          
	            if(i==length-1)
	            {
	            	if(count>max)
	                {
	                	max=count;
	                }
	            }
	        }
	                
	        return max;
	        
	    }
	public static void main(String args[])
	{
		int array[]= {1,1,0,1,1,1,1};
		MaxConseqtives test= new MaxConseqtives();
		System.out.println(test.findMaxConsecutiveOnes(array));
	}
}


