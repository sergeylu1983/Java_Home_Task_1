import java.util.Scanner;

public class ReplaceWithUpperCase {

    public void UpperCaseReplacement() {

        Scanner in = new Scanner(System.in);

//        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Enter your phrase");
        String phrase = in.nextLine();
        String delims = "[ ]+";
        String[] words = phrase.split(delims);

        for (String word : words) {

            if (word.length() >= 5) {

//                stringBuilder.append(word.toUpperCase());
                String cap = word.substring(0, 1).toUpperCase() + word.substring(1);
                System.out.println(cap);


            }
        }

    }
}
