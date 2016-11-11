import java.io.File;
import java.io.IOException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DndCharacterCreator {
	public static final String SRC = "./Defaults/DnD_5E_CharacterSheet - Form Fillable.pdf";
	public static String DEST = "./Character Sheets/";
	
    public static void main(String[] args) throws IOException {
        
        Map<String, String> formFieldsToChange = new HashMap<String, String>();
        
        Scanner scanner = new Scanner(System.in);
        
        // Character Name
        System.out.print("Please enter your Character's name: ");
        formFieldsToChange.put("CharacterName" , scanner.nextLine());

        // File name based off Character Name
        DEST = DEST + formFieldsToChange.get("CharacterName") + ".pdf";
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        
        //Character Race
        System.out.print("Please enter your Character's race: ");
        formFieldsToChange.put("Race " , scanner.nextLine());
        
        // Player Name
        System.out.print("Please enter your Name: ");
        formFieldsToChange.put("PlayerName" , scanner.nextLine());
        
        System.out.println("Constructing your Character Sheet. Please wait. Shouldn't take long.");
        new formFieldEditor().manipulatePdf(SRC, DEST, formFieldsToChange);
        
        scanner.close();
        System.out.println("Character Sheet created!");
    }
}
