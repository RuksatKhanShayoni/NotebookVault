import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class LogIn {

    public  static  void Login() {
        String SignUpId, SignUpPass;
        boolean login;
        do {

            System.out.println("\t\t\t\t\t\t\t\t======= SIGN IN =======\n\n");
            Scanner input = new Scanner(System.in);

            System.out.print("\t\t\t\t\t\t\t\tUsername   : ");
            SignUpId = input.next();
            System.out.print("\t\t\t\t\t\t\t\tPassword   : ");
            SignUpPass = input.next();
            login = false;

            try {
                File file = new File("S:/NotebookVault/Credential.txt");

                Scanner SignUp = new Scanner(file);

                while (SignUp.hasNext()) {
                    String user = SignUp.next();
                    String pass = SignUp.next();
                    if (user.equals(SignUpId) && pass.equals(SignUpPass)) {

                        login = true;

                        break;
                    }

                }
                } catch(Exception e){
                System.out.println();
            }


            if (login){
                System.out.println("\n\n\t\t\t\t\t\t\t\tSign in successful!");
            }
            else{

                System.out.println("\n\n\t\t\t\t\t\t\t\tIncorrect Credential.Please try again!");


            }

            System.out.println("\t\t\t\t\t\t\t\tPress ENTER to continue...");
            try {
                 System.in.read();

            } catch (IOException e) {
                System.out.println();
            }
        } while (!login) ;

    }
    }


