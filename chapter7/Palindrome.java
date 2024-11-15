import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
        scanner.close();
    }

   
    private static boolean isPalindrome(String str) {
        
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        
        return cleanedStr.equals(new StringBuilder(cleanedStr).reverse().toString());
    }
}
