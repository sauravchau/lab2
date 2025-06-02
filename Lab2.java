import java.util.Scanner;
public class Lab2 
{
    public static void main (String [] args)
      {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter your name:");
         String name = scanner.nextLine();
         System.out.println("Enter your RollNo:");
         int rollNo = scanner.nextInt();
         scanner.nextLine();
         System.out.println("Enter your marks(0-100):");
         int marks = scanner.nextInt();
         String grade;
         if (marks>=90)
         {
           grade = "A+";
         }
         else if (marks>=80)
         {
           grade = "A";
         }
         else if (marks>=70)
         {
           grade = "B+";
         }
         else if (marks>=60)
         {
           grade = "B";
         }
         else if (marks>=60)
         {
           grade = "C";
         }
         else if (marks>=50)
         {
           grade = "D";
         }
         else
         {
           grade ="NG";
         }
         System.out.println("Name is " +name);
         System.out.println("Roll Number : "+rollNo);
         System.out.println("Marks:"+marks);
         System.out.println("Grade: "+grade);
       
         scanner.close();
     }
}         