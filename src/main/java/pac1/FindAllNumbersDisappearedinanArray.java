package pac1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedinanArray 
{
	 public static List<Integer> findDisappearedNumbers(int[] nums)
	    {
	        List<Integer> list= new ArrayList<Integer>();
	        int i=1;
	        int count=0;
	        do{
	            for(int j=0;j<nums.length;j++)
	            {
	                if(nums[j]==i)
	                {
	                    count++;
	                }
	            }
	            if(count==0)
	            {
	                list.add(i);
	            }
	           count=0;
	            i++;
	        }while(i<=nums.length);
	      return (list);  
	    }
	 public static void main(String args[])
	 {
		 int array[]= {};
		 System.out.println(FindAllNumbersDisappearedinanArray.findDisappearedNumbers(array));
	 }
}
