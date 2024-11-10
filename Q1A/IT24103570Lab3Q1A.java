import java.util.Scanner;

public class IT24103570Lab3Q1A {
   public static void main(String [] args) {
   Scanner scanner = new Scanner(System.in);

System.out.print("Enter the price of 1kg of rice: ");
double pricePerkg = scanner.nextDouble();

System.out.print("Enter the number of kilograms to buy: ");
double quantity = scanner.nextDouble();
double totalCost = pricePerkg*quantity;

System.out.print("Total amount to pay: " + totalCost);

scanner.close();

}
}