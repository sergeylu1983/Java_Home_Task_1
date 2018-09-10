import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        FileReaderWriter fileReader = new FileReaderWriter("log_old");
        IdentifyPalindrome filePalindrome = new IdentifyPalindrome();
        filePalindrome.Palindrome();
        IntNumbers intNum = new IntNumbers();
        intNum.ReturnInt(1001);






    }
}
