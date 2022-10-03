import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class Registration {


    public static void SignUp() {
        String id, pass;
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("\t\t\t\t\t\t\t\t======= REGISTRATION =======\n\n");
            System.out.print( "\t\t\t\t\t\t\t\tEnter your username: ");
            id = input.nextLine();
            System.out.print( "\t\t\t\t\t\t\t\tEnter your password: ");
            pass = input.nextLine();
            FileWriter f = new FileWriter("S:/NotebookVault/Credential.txt", true);
            Formatter formatter = new Formatter(f);

            formatter.format("%s %s\r\n\n", id, pass);

            formatter.close();
            System.out.println("\n\n\t\t\t\t\t\t\t\tACCOUNT CREATED SUCCESSFULLY.Press ENTER to continue...");
            try {
                System.in.read();

            } catch (IOException e) {
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println();
        }


    }
}
