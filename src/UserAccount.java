
import java.util.Scanner;


public class UserAccount {
    public static void slowPrint(String message, long millisPerChar)
    {
        for (int i = 0; i < message.length(); i++)
        {
            System.out.print(message.charAt(i));

            try
            {
                Thread.sleep(millisPerChar);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace(); 
            }
        }
    }

    public void Account() {
        int choice1;
        int choice2 =0 ;
        do {
            Scanner sc1 = new Scanner(System.in);
            try {
                do {
                    Ascii obj1 = new Ascii();

                    String m1="\t\t\t\t\t\t\t\t======= USER MENU =======\n\n" +
                            "\t\t\t\t\t\t\t\t=>1. WRITE NEW NOTE\n" +
                            "\t\t\t\t\t\t\t\t=>2. EXISTING NOTES\n" +
                            "\t\t\t\t\t\t\t\t=>3. LOG OUT\n" +
                            "\t\t\t\t\t\t\t\tEnter your choice: ";
                   slowPrint(m1,10);
                    choice1 = sc1.nextInt();
                    choice2 =choice1;
                    System.out.println();
                    switch (choice1) {
                        case 1:
                            obj1 = new Ascii();

                            AbstractNote abs = new CreateNote();
                            abs.CreateNewNote();
                            break;
                        case 2:

                            do {obj1 = new Ascii();
                                String m2="\t\t\t\t\t\t\t\t======= EXISTING NOTES =======\n\n" +
                                    "\t\t\t\t\t\t\t\t=>1. ALL NOTES\n" +
                                    "\t\t\t\t\t\t\t\t=>2. SEARCH NOTE\n" +
                                    "\t\t\t\t\t\t\t\t=>3. DELETE NOTE\n" +
                                    "\t\t\t\t\t\t\t\t=>4. BACK\n" +
                                    "\t\t\t\t\t\t\t\tEnter your choice: ";
                                slowPrint(m2,10);

                                Scanner sc3 = new Scanner(System.in);
                                choice2 = sc3.nextInt();
                                System.out.println();
                                switch (choice2) {
                                    case 1:
                                        obj1 = new Ascii();
                                       ExistingNotes.AllList();
                                       break;
                                    case 3:
                                        obj1 = new Ascii();
                                        ExistingNotes.DeleteNote();

                                        break;
                                        case 2:
                                            obj1 = new Ascii();
                                        ExistingNotes.ReadFile();
                                        break;
                                    case 4:
                                        break;

                                    default:
                                        obj1 = new Ascii();
                                        System.out.println("\t\t\t\t\t\t\t\tInvalid Choice. Please try again!");

                                }
                            } while (choice2!=4);
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("\t\t\t\t\t\t\t\tInvalid Choice. Please try again!");
                            break;


                    }
                } while (choice1 != 3);

            } catch (Exception e) {
                System.out.println("\t\t\t\t\t\t\t\tInvalid Choice. Please try again!");
            }
        } while (choice2 != 3);
    }

}
