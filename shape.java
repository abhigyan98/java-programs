package assignment3;
import java.util.*;
interface Shape{
	double calcArea();
	double calcVolume();
}
class Sphere implements Shape{
	double r;
    Sphere(double r){
    	this.r=r;
    }
    public double calcArea(){
         return 4*3.14*r*r;
    }
    public double calcVolume(){
         return 4*3.14*Math.pow(r,3)/3;
    }
}
class Cone implements Shape{
	double r;
	double h;
    Cone(double r, double h){
    	this.r=r;
    	this.h=h;
    }
    public double calcArea(){
        return 3.14*r*(r+Math.sqrt(r*r+h*h));
    }
    public double calcVolume(){
        return 3.14*r*r*h/3;
    }
}
class Cylinder implements Shape{
	double r;
	double h;
    Cylinder(double r, double h){
    	this.r=r;
    	this.h=h;
    }
    public double calcArea(){
         return 2*3.14*r*(h+r);
    }
    public double calcVolume(){
         return 3.14*r*r*h;
    }
}
public class ShapeDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radious of the Sphere ");
		double r = sc.nextDouble();
		System.out.println("Enter radious and height of the Cones ");
		double r2=sc.nextDouble();
		double h2=sc.nextDouble();
		System.out.println("Enter radious and height of the Cyllender ");
		double r3=sc.nextDouble();
		double h3=sc.nextDouble();
		Shape obj1 = new Sphere(r);
		Shape obj2 = new Cone(r2,h2);
		Shape obj3 = new Cylinder(r3,h3);
		System.out.println("Area of Sphere : "+obj1.calcArea()+" Volume of Sphere : "+obj1.calcVolume());
		System.out.println("Area of Cone : "+obj2.calcArea()+" Volume of Cone : "+obj2.calcVolume());
		System.out.println("Area of Cylinder : "+obj3.calcArea()+" Volume of Cylinder : "+obj3.calcVolume());
	}

}
