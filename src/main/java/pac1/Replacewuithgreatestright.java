package pac1;

public class Replacewuithgreatestright
{
	    public static int[] replaceElements(int[] arr) 
	    {
	    	int max=0;
	          if(arr.length==1)
	        {
	            arr[0]= -1;
	        }
	      
	        for(int i=0;i<arr.length;i++)
	        {
	        	if(i==arr.length-1)
	        	{
	        		arr[i]=-1;
	        	}
	        	for(int j=i+1;j<arr.length;j++)
	        	{
	        		if(j==i+1)
	        		{
	        			max= arr[j];
	        		}
	        		
	        		else if(arr[j]> max)
	        		{
	        			max= arr[j];
	        		}
	        	}
	        	arr[i]= max;
	        	max=0;
	        }
	       return arr; 
	    }
	    
	    public static void main(String args[])
	    {
	    	
	    }
	}

