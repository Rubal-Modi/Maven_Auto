package pac1;

class Test {
    public void duplicateZeros(int[] arr) 
    {
        int len= arr.length;
        
      
        for(int i=0;i<len;i++)
        {
            if(arr[i]==0)
            {
                if(i==len-1)
                {
                        break;
                }
                else
                {
                 for(int j=len-2;j>=i+1;j--)
                    {
                        arr[j+1]= arr[j];
                    }
                    arr[i+1]=0;
                }
                
                
            } 
        }
        
        for(int k=0;k<len;k++)
        {
        	System.out.print(arr[k] + " , ");
        }
    }
    
   public static void main(String args[])
   {
	   Test test= new Test();
	   int array[]= {1,0,2,0,4,5};
	   test.duplicateZeros(array);
	   
   }
}