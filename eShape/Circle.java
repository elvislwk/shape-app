// Circle class derived from Shape class
package eShape;

public class Circle extends Shape
{
  	// Attributes
   private double radius;
  
  	// Behaviors
  
  	// constructors
   public Circle() { }										// default constructor
 	 
   public Circle(String t, String c, double r) // parameterised constructor
   { 
      super(t,c); 
      radius = r;
   }
  
  	// set and get methods
   public void setRadius(double r) { radius = r; }
   public double getRadius() { return radius; }
   
   public double findArea()
   {
      return 3.14159 * radius * radius;
   }
   
   public double findPerimeter()
   {
      return 2 * 3.14159 * radius;
   }
   
	// toString method
   public String toString()
   {
      return super.toString() + "\tRadius:" + radius;
   }
}