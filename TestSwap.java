
public class TestSwap {

	public static void main(String[] args) {
		
		TestSwap t = new TestSwap();
		
		t.swapWithinFour("12345678");
		//t.swapChars(new char[]{'1','2','3','4'}, 1,3);
		
	}
	
	private void swapWithinFour(String testString)
	{
		char[] charArray = testString.toCharArray();
		
		printChars(charArray);
		for(int i=0;i<charArray.length-1;i++)
		{
			if(i%4==0 || i%4 ==1)
			{
				//swap current i & i+2
				charArray = swapChars(charArray, i, i+2);
				printChars(charArray);
			}
			
		}
		printChars(charArray);
		
	}
	private char[] swapChars(char[] array,int i1,int i2)
	{
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
