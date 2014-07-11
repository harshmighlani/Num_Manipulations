
import java.util.ArrayList;
import java.util.List;

public class TestCommon {

	public static void main(String[] args) {
		TestCommon c = new TestCommon();
		c.check("abcdekl", "ell");
		
	}
	
	private void check(String a, String b)
	{
		List<Character> charList = new ArrayList<Character>();
		
		for(char cha: a.toCharArray())
		{
			if(b.contains(String.valueOf(cha)))
			{
				charList.add(cha);
			}
		}
		
		for(char test: charList)
		{
			System.out.print(test);
		}
	}
}
