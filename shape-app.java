import eShape.Shape;
import eShape.Circle;
import eShape.Square;
import java.util.*; // used for Scanner and ArrayList

public class shapeApp
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      ArrayList shapeList = new ArrayList();
      Shape s1 = new Circle("Circle", "Red", 10.0);
      Shape s2 = new Circle("Circle", "Blue", 20.0);
      Shape s3 = new Square("Square", "Blue", 30.0);
      shapeList.add(s1);
      shapeList.add(s2);
      shapeList.add(s3);
      int option;
      do
      {
         displayMenu();
         System.out.print("Enter your option : ");
         option = input.nextInt();
         switch (option)
         {
            case 1: listShapes(shapeList);
               break;
            case 2: displayAreas(shapeList);
               break;
            case 3: displayPerimeters(shapeList);
               break;
            case 4: changeColor(shapeList);
               break;
            case 5: changeSize(shapeList);
               break;
            case 0: System.out.println("Exiting programme...");
               break;
            default:System.out.println("Error: Invalid Input");
         }
      }while (option != 0);
   }
   public static void displayMenu()
   {
      System.out.println("---------------- M E N U --------------------");
      System.out.println("[1] List all the shapes");
      System.out.println("[2] Display the areas of the shapes");
      System.out.println("[3] Display the perimeters of the shapes");
      System.out.println("[4] Change the color of a shape");
      System.out.println("[5] Change the size of a shape");
      System.out.println("[0] Exit");
      System.out.println("---------------------------------------------");
   }
   public static void listShapes(ArrayList shapeList)
   {
      for (int i=0; i<shapeList.size(); i++)
      {
         Shape s = (Shape) shapeList.get(i);
         System.out.println(s.toString());
      }
   }
   public static void displayAreas(ArrayList shapeList)
   {
      for (int i=0; i<shapeList.size(); i++)
      {
         Shape s = (Shape) shapeList.get(i);
         System.out.println("s" + (i+1) + ":" + s.findArea());
      }
   
   }
   public static void displayPerimeters(ArrayList shapeList)
   {
      for (int i=0; i<shapeList.size(); i++)
      {
         Shape s = (Shape) shapeList.get(i);
         System.out.println("s" + (i+1) + ":" + s.findPerimeter());
      }
   
   }
   public static void changeColor(ArrayList shapeList)
   {
      Scanner input = new Scanner(System.in);
      for (int i=0; i<shapeList.size(); i++)
      {
         Shape s = (Shape) shapeList.get(i);
         System.out.println("index:" + (i+1) + "\t" +s.toString());
      }
   
      System.out.print("Enter shape index : ");
      int index = input.nextInt();
      for (int i=0; i<shapeList.size(); i++)
      {
         Shape s = (Shape) shapeList.get(i);
         if (index == (i+1))
         {
            System.out.print("Enter color : ");
            String color = input.next();
            s.setColor(color);
            System.out.println("Updated successfully");
            return;
         }
      }
      System.out.println("Error: Invalid Input");
   }
   public static void changeSize(ArrayList shapeList)
   {
      Scanner input = new Scanner(System.in);
      for (int i=0; i<shapeList.size(); i++)
      {
         Shape s = (Shape) shapeList.get(i);
         System.out.println("index:" + (i+1) + "\t" +s.toString());
      }
   
      System.out.print("Enter shape index : ");
      int index = input.nextInt();
      for (int i=0; i<shapeList.size(); i++)
      {
         Shape s = (Shape) shapeList.get(i);
         if (index == (i+1))
         {
            if (s instanceof Circle)
            {
               Circle s1 = (Circle)s;
               System.out.print("Enter radius : ");
               double radius = input.nextDouble();
               s1.setRadius(radius);
               System.out.println("Updated successfully");
               return;
            }
            else if (s instanceof Square)
            {
               Square s1 = (Square)s;
               System.out.print("Enter length : ");
               double length = input.nextDouble();
               s1.setLength(length);
               System.out.println("Updated successfully");
               return;
            }
         }
      }
      System.out.println("Error: Invalid Input");
   }
   
}