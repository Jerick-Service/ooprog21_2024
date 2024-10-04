import java.util.Scanner;
public class BillingActivity{
   public static void main(String[]args){
   Scanner scan = new Scanner(System.in);
   System.out.println("Please Input the Price");
   double price = scan.nextDouble();
   System.out.println("Please Input the Quantity");
   int quantity = scan.nextInt();
   System.out.println("Please Input this Discount");
   int couponDiscount = scan.nextInt();
   computeBill(price);
   computeBill( price,  quantity);
   computeBill( price,  quantity, couponDiscount);
   }
   public static void computeBill(double price){
   double total = (price*0.08) + price;
   System.out.println("The total price for the bill is: $"+total);
   }
   public static void computeBill(double price, int quantity){
   double total = ((price*0.08) + price)*quantity;
   System.out.println("The total price for the bill is: $"+total);
   }
   public static void computeBill(double price, int quantity, int couponDiscount){
   double total1 = ((price*0.08) + price)*quantity;
   double totalFinal = total1-couponDiscount;
   System.out.println("The total price for the bill is: $"+totalFinal);
   }

    }
