import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileReaderWriter {


    public FileReaderWriter(String filename) throws FileNotFoundException {

        File fileNew = new File("log_new.txt");

        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        PrintWriter pw = new PrintWriter(fileNew);

        String line = scanner.nextLine();
        String[] lines = line.split(" ");

        for (String rec : lines) {
            if (rec.toString().toLowerCase().contains("error")) {
                pw.println(rec.toString());

            }


            System.out.println(rec.toString());


        }
        pw.close();
        scanner.close();
    }


}

