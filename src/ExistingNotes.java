import java.io.*;
import java.util.Scanner;


    public  class ExistingNotes {

        public static void AllList() {
            try {
                System.out.println("\t\t\t\t\t\t\t\t======= ALL NOTES =======\n");
                File file = new File("S:/NotebookVault/CreateNewNotes");
                String[] files = file.list();
                for (String string : files) {
                    System.out.println("\t\t\t\t\t\t\t\t=> " + string);

                }
                System.out.println("\n\n\t\t\t\t\t\t\t\tPress ENTER to continue...");
                try {
                    System.in.read();

                } catch (IOException e) {
                    System.out.println();
                }
            } catch (NullPointerException npe1) {
                npe1.printStackTrace();
            }
        }

        public static void ReadFile() {
            Scanner scanner = new Scanner(System.in);
            BufferedReader br = null;
            String line;

            System.out.println("\t\t\t\t\t\t\t\t======= SEARCH NOTE =======\n");
            System.out.print("\t\t\t\t\t\t\t\tEnter the Title: ");
            try {
                br = new BufferedReader(new FileReader("S:/NotebookVault/CreateNewNotes/" + scanner.next() + ".txt"));

            } catch (FileNotFoundException e) {
                System.out.println("\t\t\t\t\t\t\t\tThe Note is not found.Please try again...");
                try {
                    System.in.read();

                } catch (IOException ioException) {
                    System.out.println();
                }
            }
            try {
                while ((line = br.readLine()) != null) {
                    System.out.println();
                    System.out.print("NOTE: ");
                    System.out.println(line);
                    System.out.println("\n\n\t\t\t\t\t\t\t\tPress ENTER to continue...");
                    try {
                        System.in.read();

                    } catch (IOException e) {
                        System.out.println();
                    }
                }
                br.close();
            } catch (Exception e) {
                System.out.println();
                try {
                    System.in.read();

                } catch (IOException ioException) {
                    System.out.println();
                }
            }
        }

        public static void DeleteNote() {
            System.out.println("\n\n\t\t\t\t\t\t\t\t======= DELETE NOTE =======\n");
            Scanner scanner = new Scanner(System.in);
            System.out.print("\t\t\t\t\t\t\t\tEnter the note Title: ");
            File file = new File("S:/NotebookVault/CreateNewNotes/" + scanner.next() + ".txt");

            if (file.delete()) {

                System.out.println("\n\n\t\t\t\t\t\t\t\tYour note has been deleted.Press ENTER to continue...");


            }
            else {
                System.out.println("\n\n\t\t\t\t\t\t\t\tYour note has not been deleted.Please try again ...");
            }
            try {
                System.in.read();

            } catch (IOException e) {
                System.out.println();
            }

        }
    }
