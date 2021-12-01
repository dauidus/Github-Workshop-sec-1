import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.PrintStream;

//jhfbwihferiofuiijo

public class Main{
  public static void main(String[] args) throws FileNotFoundException {
        try {
            PrintStream o = new PrintStream(new File("vowels.txt"));
            PrintStream z = new PrintStream(new File("consonants.txt"));


            PrintStream console = System.out;
            File myObj = new File("ziptable.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                char c = data.charAt(0);
                char []vowels = {'A', 'E', 'I', 'O', 'U'};
                char []consonants = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};

                for (char i : vowels) {
                    if (i == c)
                        System.setOut(o);
                    }

                for (char i : consonants) {
                    if (i == c)
                        System.setOut(z);
                }
                    System.out.println(data);

                }
	//kenz was here

            myReader.close();

            System.setOut(console);
            Scanner input = new Scanner(myObj);
            while (input.hasNextLine()) {
                String data = input.nextLine();
                System.out.println(data);
            }

//My favorite color is black

    } catch (FileNotFoundException e) {
            System.out.println("An error occurred...");
            e.printStackTrace();
        }
    }
}
