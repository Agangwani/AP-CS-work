
public class UsingStrings
{

	public static void main(String[]args)
	{
		String myName = new String("Aman Gangwani");
		String greeting = "Greetings class";
		String Str = "Hello There!";
		System.out.println("length: " + Str.length() );
		System.out.println("character at: " + Str.charAt(0) );
		System.out.println("character at: " + Str.charAt(Str.length()-1) );
		System.out.println ("End of String: " + Str.substring(6));
		System.out.println("Beginning of string: " + greeting.substring(0, 5));
		System.out.println("MiddleL "+ greeting.substring(5, 6) );
		System.out.println("Where is a? " + Str.indexOf('a'));
		System.out.println("where is e?" + Str.indexOf('e') );
		System.out.println("where is er" + Str. indexOf("er"));
		System.out.println(Str.replace('1',  '$'));
	
	}
	
}
