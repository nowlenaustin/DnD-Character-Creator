import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class dndInfo {
	
	public List<String> races;
	public List<String> classes;
	
	dndInfo(String RACES, String CLASSES) throws IOException{
		// open and read file with all the races 
		races = Files.readAllLines(Paths.get(RACES));
		
		// open and read file with all the classes		
		classes = Files.readAllLines(Paths.get(CLASSES));
	}
}
