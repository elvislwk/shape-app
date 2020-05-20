// Shape class
package eShape;

public abstract class Shape
{
   // attributes
   private String type;
   private String color;
   
   // behaviours
   
   // constructors
   public Shape()									// default constructor
   {
       // attributes will be initialized to their default values
   }

   public Shape(String t, String c)	// parameterised constructor
   {
      type = t;
      color = c;
   }
   
   // set and get methods
   public void setType(String t) { type = t; }
   public String getType() { return type; }
   public void setColor(String c) { color = c; }
   public String getColor() { return color; }
   
   public abstract double findArea();
   public abstract double findPerimeter();
   
   // toString method
   public String toString()
   {
      return "Type:" + type + "\tColor:" + color;
   }
   
}