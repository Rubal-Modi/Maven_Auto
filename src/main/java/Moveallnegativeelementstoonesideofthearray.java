
public class Moveallnegativeelementstoonesideofthearray 
{
	public static int[] moveElement(int [] nums)
	{
	int x=0;
	int j=nums.length-1;
	int temp;
	
	while(x<=j)
	{
		if(nums[x]>0 && nums[j]<0)
		{
			temp=nums[x];
			nums[x]= nums[j];
			nums[j]= temp;
			x++;
			j--;
		}
		else if(nums[x]<0 && nums[j]<0)
		{
			x++;
		}
		else if((nums[x]>0 && nums[j]>0))
		{
			j--;
		}
		
		else {
		x++;
		j--;
		}
	}
	
	return nums;
	}

	public static void main(String[] args) 
	{
		int inputarray[]= {-13,-12,1,5,7,-1,0,4,-8};
	    int outputArrayMethod1[]= Moveallnegativeelementstoonesideofthearray.moveElement(inputarray);
	    for(int i=0;i<inputarray.length;i++)
	    {
	    	System.out.print(outputArrayMethod1[i]+ ",");
	    }
				
		

	}

}
