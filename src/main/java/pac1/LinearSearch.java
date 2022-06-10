package pac1;

import java.util.Arrays;

public class LinearSearch
{
		    public boolean checkIfExist(int[] arr)
	    {
	        if(arr==null || arr.length==0)
	        {
	            return false;
	        }
	        
			
			
			/*
			 * Arrays.sort(arr); System.out.println("after sorting"); for(int
			 * k=0;k<arr.length;k++) { System.out.println(arr[k]); }
			 */
			 
			 
	        for(int j=0;j<arr.length-1;j++)
	        {
	        	for(int i=1;i<arr.length;i++)
	        	{
	        	if(arr[i]== 2 * arr[j] || (arr[i]==arr[j]/2 && arr[j]%2==0))
	        			{
	        				System.out.println(arr[j]+ " and array [i]: " +arr[i]);
	        				return true;
	        			
	        			}
	        
	        	}
	        }
	        
	        
	     return false;
	    }


	public static void main(String[] args)
	{
		LinearSearch obj= new LinearSearch();
		int array[]= {102,-592,457,802,98,-132,883,356,-857,461,-453,522,250,476,991,540,-852,-485,-637,999,-803,-691,-880,881,-584,750,-124,745,-909,-892,304,-814,868,665,50,-40,26,-242,-797,-360,-918,-741,88,-933,-93,360,-738,833,-191,563,449,840,806,-87,-950,508,74,-448,-815,-488,639,-334};
		System.out.println(obj.checkIfExist(array));
	}

}
