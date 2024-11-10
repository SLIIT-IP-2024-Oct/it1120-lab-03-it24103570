import java.util.Scanner;
 public class IT24103570Lab3Q1B {
 public static void main (String [] args) {
 Scanner scanner = new Scanner(System.in);

System.out.print("Enter the price of 1Kg of rice:");
double pricePerKg=scanner.nextDouble();
 
System.out.print("Enter the number of kilograms to buy: ");
double quantity = scanner.nextDouble();
double totalCost=pricePerKg*quantity;
double discount= totalCost*0.1;
double finalAmount = totalCost-discount;

System.out.print("Final amount to pay after discount: "+finalAmount);
 scanner.close();
}
}
 