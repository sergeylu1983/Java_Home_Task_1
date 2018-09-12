import java.util.*;

public class ReplaceWithUpperCase {

    public void UpperCaseReplacement() {

        Scanner in = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Enter your phrase");
        String phrase = in.nextLine();
//        String delims = "[ ]+";
//        String words = phrase.split(delims);
//        System.out.println(words.toString());
//        List<String> phraseList = new ArrayList<>();

        for (String word : phrase.split(" ")) {

//            System.out.println(word);

            if (word.length() < 5) {
//                phraseList.add(word);
                stringBuilder.append(word + " ");
            } else {

                stringBuilder.append(word.substring(0, 1).toUpperCase() + word.substring(1) + " ");
//                phraseList.add(word.substring(0, 1).toUpperCase() + word.substring(1));

            }


        }
        String completedString = stringBuilder.toString();

        System.out.println(completedString.toString());


    }
}
