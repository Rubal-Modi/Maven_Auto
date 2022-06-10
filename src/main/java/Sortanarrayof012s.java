
public class Sortanarrayof012s 
{
 public static int[] checknumber(int [] nums)
 {		int i=0;int j=0; int k= nums.length-1;
 		int array[]=new int[nums.length];
 		while(i<nums.length)
 		{
 			if(nums[i]==0)
 			{
 				array[j]=nums[i];
 				j++;
 			}
 			if(nums[i]==2)
 			{
 				array[k]=nums[i];
 				k--;
 			}
 			
 			i++;
 		}
 		for(int x=j;x<=k;x++)
 		{
 			array[x]=1;
 		}
 		
 	 		return array;
 }
	public static void main(String[] args) 
	{
		int inputarray[]= {1,2,0,0,0,1,2,0,1,1,2,2,0,0,0,1,1,1,};
		int outputArrayMethod1[]= checknumber(inputarray);
	    for(int i=0;i<inputarray.length;i++)
	    {
	    	System.out.print(outputArrayMethod1[i]+ ",");
	    }
	}

}
