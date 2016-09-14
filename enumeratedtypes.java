
public class enumeratedtypes
{
enum Seasons{Winter, spring, summer, fall};
enum Days{ Sunday, monday, tuesday, wednesday, thursday, friday, saturday};
enum flavor{mintChocolatechip, strawberry, vanilla, mango};
public static void main(String[]args)
{
	flavor cone1, cone2 ,cone3;
	cone1 = flavor.vanilla;
	cone2 = flavor.strawberry;
	cone3 = flavor.mintChocolatechip;
	System.out.println("cone1: " + cone1);
	System.out.println("cone2: " + cone2);
	System.out.println("cone3: " + cone3);
	
	cone3 = cone2; 
	System.out.println("cone1: " + cone1);
	System.out.println("cone2: " + cone2);
	System.out.println("cone3: " + cone3);
	// use ordinal to find the position in the list
	System.out.println(" position of cone2: " + cone2.ordinal() );
}
	
}
