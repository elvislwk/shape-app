// Square class derived from Shape class
package eShape;

public class Square extends Shape
{
  	// Attributes
   private double length;
  
  	// Behaviors
  
  	// constructors
   public Square() { }										// default constructor
 	 
   public Square(String t, String c, double l) // parameterised constructor
   { 
      super(t,c); 
      length = l;
   }
  
  	// set and get methods
   public void setLength(double l) { length = l; }
   public double getLength() { return length; }
   
   public double findArea()
   {
      return length * length;
   }
   
   public double findPerimeter()
   {
      return 4 * length;
   }
   
	// toString method
   public String toString()
   {
      return super.toString() + "\tLength:" + length;
   }
}