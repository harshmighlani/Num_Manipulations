
public class SwapExtremePairs {

	public static void main(String[] args) {

		SwapExtremePairs t = new SwapExtremePairs();

		t.swapWithinFour("12345678");
		//t.swapChars(new char[]{'1','2','3','4'}, 1,3);

	}

	private void swapWithinFour(String testString)
	{
		char[] charArray = testString.toCharArray();

		int length = charArray.length;

		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length+1;j++)
			{
				if(i+j == (length+1) ||i+j == (length-1))
				{
					if(j!=0)
					{
						System.out.println(" i : "+ i + "j: "+j);
						swapChars(charArray, i, j-1);
						printChars(charArray);
					}
				}

			}
		}

	}
	private char[] swapChars(char[] array,int i1,int i2)
	{
		//12 34 56 78
		//78 56 34 12
		char t = array[i1];
		array[i1]=array[i2];
		array[i2] = t;
		return array;
	}
	private void printChars(char[] charArray)
	{
		for(char t: charArray)
		{
			System.out.print(t);
		}
		System.out.println("\n");
	}
}
