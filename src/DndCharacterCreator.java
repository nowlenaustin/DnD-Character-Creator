import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DndCharacterCreator {
	public static final String SRC = "./assets/DnD_5E_CharacterSheet - Form Fillable.pdf";
	public static String DEST = "./Character Sheets/";
	public static final String RACES = "./assets/races.txt";
	public static Map<String, String> formFieldsToChange;
	public static Scanner userInput;
	public static dndInfo DndInfo; // contains info needed to create characters (ie, races, classes, etc)
	
	
    public static void main(String[] args) throws IOException {
    	/** Starting point for DndCharacterCreator program */
    	
    	// setup for program
        setup();
        
        // Player Name
        getPlayerName();
    	
        // Character Name
        getCharacterName();
        
        //Character Race
        getCharacterRace();
        
        // Create PDF
        createPDF();
        
        close();
    }
    
    public static void setup() throws IOException{
        // create list of races from file
    	DndInfo = new dndInfo(RACES);
    	// form fields to be filled in on PDF
        formFieldsToChange = new HashMap<String, String>();
        // needed to read from console input
        userInput = new Scanner(System.in);
    }
    
    public static void getCharacterName(){
    	/** Prompts user for their desired name for their character and stores 
    	 * the value in the public variable DndCharacterCreator.formFieldsToChange */
        System.out.print("Please enter your Character's name: ");
        formFieldsToChange.put("CharacterName" , userInput.nextLine());
        System.out.println(""); // print empty line
    }
    
    public static void getCharacterRace(){
    	/** Prompts user for their desired race for their character and stores 
    	 * the value in the public variable DndCharacterCreator.formFieldsToChange */
    	String race;
        while(true){
        	// build string to print out all race options
        	StringBuilder sb = new StringBuilder();
        	sb.append("Races to choose from: ");
        	for(String s : DndInfo.races){
        		sb.append(s);
        		sb.append(", ");
        	}
        	//print all race options
        	System.out.println(sb.toString());
        	
        	System.out.print("Please enter your Character's race out of the listed options: ");
        	race = userInput.nextLine();
        	if(DndInfo.races.contains(race)){
        		break;
        	}else{
        		System.out.println("\"" + race + "\" is not a valid race. Please input a valid race.");
        		System.out.println(""); // print empty line
        	}
        }
        
        System.out.println(""); // print empty line
        formFieldsToChange.put("Race " , race);
    }
    
    public static void getPlayerName(){
    	/** Prompts user for the name they wish to be displayed on their character sheet and 
    	 * stores the value in the public variable DndCharacterCreator.formFieldsToChange */
        System.out.print("Please enter your Name: ");
        formFieldsToChange.put("PlayerName" , userInput.nextLine());
        System.out.println(""); // print empty line
    }
    
    public static void createPDF() throws IOException{
    	/** Takes data stored in DndCharacterCreatorformFieldsToChange and creates a PDF 
    	 * character sheet using the stored values. The PDF is stored in the DndCharacterCreator.DEST 
    	 * and is named using the character's name */
    	
        // PDF file name based off Character Name
        DEST = DEST + formFieldsToChange.get("CharacterName") + ".pdf";
        File file = new File(DEST);
        file.getParentFile().mkdirs(); // create directories for file if they do not exist
        
        // Create PDF
        System.out.println("Making your Character Sheet. Please wait. This shouldn't take long.");
        System.out.println(""); // print empty line
        new formFieldEditor().manipulatePdf(SRC, DEST, formFieldsToChange);
        System.out.println("Your Character Sheet has been created! Thank you for using my program!");
    }
    
    public static void close() throws IOException{
    	/** Cleans up anything needing to be closed before program end */
    	System.out.println("Press ENTER to close.");
        System.in.read();
    	userInput.close();
    }
}
