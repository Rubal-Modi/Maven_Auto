package pac1;

public class NumberofEvenNumberInDigit 
{
	public int findNumbers(int[] nums) 
	{
		int count = 0;
		int output = 0;
		for (int i = 0; i < nums.length; i++) 
		{
			while (nums[i] != 0) 
			{
				nums[i] /= 10;
				++count;
			}

			if (count % 2 == 0) 
			{
				++output;
			}
			count = 0;
		}

		return output;
	}

	public static void main(String args[]) {
		int array[] = { 555, 901, 482, 1771,12345, 123456};
		NumberofEvenNumberInDigit test = new NumberofEvenNumberInDigit();
		System.out.println(test.findNumbers(array));
	}
}
