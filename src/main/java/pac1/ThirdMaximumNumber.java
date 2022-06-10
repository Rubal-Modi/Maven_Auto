package pac1;

import java.util.Arrays;

public class ThirdMaximumNumber
{
	public static int thirdMax(int[] nums) 
    {
		Arrays.sort(nums);    
        int number=1;
        int array[]=new int[nums.length];
        array[0]=nums[0];
        int i;
        if(nums.length<3)
        {
            return nums[nums.length-1];
        }
        for(i=1;i<nums.length;i++)
        {
			if(nums[i]!=nums[i-1])
            {
				array[number]= nums[i];
				number++;
            }
        }
        System.out.println( "number: "+number);
        for(int k=0;k<array.length;k++)
        {
        	
        	System.out.print(array[k]+ ",");
        	
        }
        if(number==2)
        {
            return array[1];
        }  
        if(number==1)
        {
            return array[0];
        } 
        return array[number-3];
    }

	public static void main(String[] args) 
	{
		int array[]= {1,2,2,3};
		System.out.println("printint third max number : "+ThirdMaximumNumber.thirdMax(array));
		
	}

}
