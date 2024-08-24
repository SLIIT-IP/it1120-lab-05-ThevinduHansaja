import java.util.Scanner;
public class IT24101843Lab5Q2
{
public static void main(String[]args)
{
 Scanner input=new Scanner(System.in);
 int num;
  System.out.println("Enter the number of members introduced:");
  num=input.nextInt();

  if(num>0)
  {
  switch(num)
   {
   case 0: System.out.print("No Prize");
   case 1: System.out.print("Prize is a: Pen");
   case 2: System.out.print("Prize is a: Umbrella");
   case 3: System.out.print("Prize is a: Bag");
   case 4: System.out.print("Prize is a: Travelling Chair");
   default:System.out.print("Prize is a: Headphone");
   }
  }
  
 else
{
 System.out.println("Input must be a number 0 or greater");
  }
 }
}