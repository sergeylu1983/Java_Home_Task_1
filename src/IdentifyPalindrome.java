import java.util.Scanner;

public class IdentifyPalindrome {

    public void Palindrome() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = in.nextLine();
        isPalindrome(word);

        if (isPalindrome(word)) {
            System.out.println("Palindrome identified");

        } else {
            System.out.println("Not a Palindrome");
        }


    }

    public static boolean isPalindrome(String text) {
        return text.replaceAll("\\W", "")
                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W", ""))
                        .reverse().toString());
    }
}
