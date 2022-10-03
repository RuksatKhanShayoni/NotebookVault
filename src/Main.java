import java.util.Scanner;

    public class Main {
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


        public static void main(String[] args) {

            int choice ;
            int choice2=0;
            do {
                Scanner sc = new Scanner(System.in);
                try {
                    do {
                        Ascii obj1=new Ascii();
                        String message="\t\t\t\t\t\t\t\t======= MAIN MENU =======\n\n " +
                                "\t\t\t\t\t\t\t\t1=> SIGN IN\n" +
                                "\t\t\t\t\t\t\t\t2=> REGISTRATION\n" +
                                "\t\t\t\t\t\t\t\t3=> EXIT\n\n" +
                                "\t\t\t\t\t\t\t\tEnter your choice: ";
                        slowPrint(message,10);
                        choice = sc.nextInt();
                        choice2 = choice;

                        System.out.println();


                        switch (choice) {
                            case 1:

                                obj1 = new Ascii();
                                LogIn.Login();
                                UserAccount account = new UserAccount();
                               account.Account();
                                break;
                            case 2:
                                obj1 = new Ascii();
                                Registration.SignUp();
                                break;

                            case 3:
                                break;
                            default:
                                obj1 = new Ascii();
                                System.out.println("\t\t\t\t\t\t\t\tInvalid Choice. Please try again!");
                                break;

                        }
                    } while (choice != 3);
                } catch (Exception e) {
                    new Ascii();
                    System.out.println("\t\t\t\t\t\t\t\tInvalid Choice. Please try again!");
            }

          } while (choice2 != 3);
        }


    }


