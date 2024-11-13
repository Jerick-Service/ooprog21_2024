import java.util.Scanner;

public class SpoonerismGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Word 1: ");
        String word1 = scanner.nextLine().trim();
        System.out.print("Word 2: ");
        String word2 = scanner.nextLine().trim();

        
        int index1 = findFirstVowelIndex(word1);
        int index2 = findFirstVowelIndex(word2);

        
        if (index1 == -1 || index2 == -1 || index1 == 0 || index2 == 0) {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
        } else {
            
            String spoonerizedWord1 = word2.substring(0, index2) + word1.substring(index1);
            String spoonerizedWord2 = word1.substring(0, index1) + word2.substring(index2);

            System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
        }

        scanner.close();
    }

    
    private static int findFirstVowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return i; // Return the index of the first vowel
            }
        }
        return -1; // Return -1 if no vowel is found
    }
}
