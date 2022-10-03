import java.io.File;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreateNote extends AbstractNote {




CreateNote() {
    System.out.println("\t\t\t\t\t\t\t\t======= WRITE NEW NOTE =======\n");
}
    public void CreateNewNote()
    {
        Scanner sct= new Scanner(System.in);
        System.out.print("\t\t\t\t\t\t\t\tTitle:");
        String FirstTitle= sct.nextLine();
        String FinalTitle =FirstTitle+".txt";
try {
    File a =new File("S:/NotebookVault/CreateNewNotes");
    a.mkdir();
    File f=new File("CreateNewNotes",FinalTitle);

    System.out.print("\n\t\t\t\t\t\t\t\tWrite your note : \n");
    String note= sct.nextLine();
    PrintWriter PrintNote=new PrintWriter(f);
    PrintNote.println(note);
    PrintNote.close();
    System.out.println("\n\t\t\t\t\t\t\t\tYour note has been SAVED.\n");
    System.out.println("\t\t\t\t\t\t\t\tPress ENTER to continue...");
    try {
        System.in.read();

    } catch (IOException e) {
        System.out.println();
    }

}catch (Exception e){
    System.out.println();
}
    }
}
