import java.util.Scanner;
 public class IT24103570Lab3Q2 {
 public static void main (String [] args){
 Scanner scanner = new Scanner (System.in);
 
 System.out.print("Enter monthly salary:");
 double monthlySalary = scanner.nextDouble();

 System.out.print("Enter number of OT hours:");
 int OThours = scanner.nextInt();

 System.out.print("Enter OT hourly Rate:");
 double OThourlyRate = scanner.nextDouble();

 double OTAmount = OThours*OThourlyRate;
 double TotalSalary = monthlySalary + OTAmount;

 System.out.print("Total salary:"+ TotalSalary);

 scanner.close();
}
}
 