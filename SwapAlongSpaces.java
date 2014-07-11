import java.util.StringTokenizer;

public class SwapAlongSpaces {

	public static void main(String[] args) {
		
		SwapAlongSpaces s = new SwapAlongSpaces();
		s.stringCheck("i am a human being");
	}
	private void stringCheck(String str)
	{
		StringTokenizer strt = new StringTokenizer(str," ");
		
		while(strt.hasMoreTokens())
		{
			System.out.println(reverse(strt.nextToken()));
		}
	}
	
	private String reverse(String str)
	{
		return (new StringBuffer(str).reverse().toString());
	}
}
