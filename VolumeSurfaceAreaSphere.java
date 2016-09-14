import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
// calculate the volume and surface area of a sphere
public class VolumeSurfaceAreaSphere 
{
	public static void main(String[]args)
	{
		int radius;
		double Volume,SurfaceArea;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a radius for the sphere ");
		radius = scan.nextInt();
		Volume = (4/3)*Math.PI*Math.pow(radius,3);
		SurfaceArea = 4*Math.PI*Math.pow(radius,2);
		DecimalFormat fmt = new DecimalFormat ("0.####");
		System.out.println("The volume of the sphere is " + fmt.format(Volume));
		System.out.println("The Surface Area of the Sphere is " + fmt.format(SurfaceArea));
	}
	
}
