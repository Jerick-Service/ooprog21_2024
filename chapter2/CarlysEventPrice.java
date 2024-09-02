import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
        int pricePerGuest = 35;
        System.out.println("******************************");
        System.out.println("* Carly's makes food that makes *");
        System.out.println("*         it a part             *");
        System.out.println("******************************");

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many guests are going to attend the event? ");
        int numberOfGuests = scanner.nextInt();

        System.out.println("Number of guests: " + numberOfGuests);
        System.out.println("Price per guest: $" + pricePerGuest);

        int totalPrice = pricePerGuest * numberOfGuests;
        System.out.println("The total price is: $" + totalPrice);

        boolean isLargeEvent = numberOfGuests >= 50;
        System.out.println("Is this a large event? " + isLargeEvent);
    }
}
