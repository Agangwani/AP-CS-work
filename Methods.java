
public class Methods 
{
	public static void main (String[]args)
	{
		String result = twoString("Hi");
		//System.out.println(result);
		firstChar("java");
	}
	public static void firstChar(String str)
	{
		System.out.println(str.charAt(0));
	}
	public static String twoString(String str)
	{
		String newString =  str.concat(str);
		return newString;
	}

}
