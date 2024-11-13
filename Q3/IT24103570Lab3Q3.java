import java.util.Scanner;

 public class IT24103570Lab3Q3{
 public static void main (String [] args){
 Scanner input = new Scanner(System.in);

 System.out.print("Enter the Rupee amount :");
 double amount =input.nextDouble();

 System.out.println();
 int X =(int) amount;

 int noOf5000Notes =X/5000;
 int remOf5000 = X%5000;
 int noOf2000Notes = remOf5000/2000;
 int remOf2000 = remOf5000%2000;
 int noOf1000Notes = remOf2000/1000;
 int remOf1000 = remOf2000%1000;
 int noOf500Notes = remOf1000/500;
 int remOf500 = remOf1000%500;
 int noOf100Notes = remOf500/100;
 int remOf100 = remOf500%100;
 int noOf50Notes = remOf100/50;
 int remOf50 = remOf100%50;
 int noOf20Notes = remOf50/20;
 int remOf20 = remOf50%20;
 int noOf10Notes = remOf20/10;
 int remOf10 = remOf20%10;
 int noOf5Coins = remOf10/5;
 int remOf5 = remOf10%5;
 int noOf2Coins = remOf5/2;
 int remOf2 = remOf5%2;
 int noOf1Coins = remOf2/1;
 int remOf1 = remOf2%1;

 System.out.println("5000 Notes-" + noOf5000Notes);
 System.out.println("2000 Notes-" + noOf2000Notes);
 System.out.println("1000 Notes-" + noOf1000Notes);
 System.out.println("500 Notes-" + noOf500Notes);
 System.out.println("100 Notes-" + noOf100Notes);
 System.out.println("50 Notes-" + noOf50Notes);
 System.out.println("20 Notes-" + noOf20Notes);
 System.out.println("10 Notes-" + noOf10Notes);
 System.out.println("05 Notes-" + noOf5Coins);
 System.out.println("02 Notes-" + noOf2Coins);
 System.out.println("01 Notes-" + noOf1Coins);

}
}