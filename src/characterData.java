import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Austin on 6/20/2017.
 */
public class characterData {
    String characterName;
    String playerName;
    String level;
    String characterClass;
    String race;

    private Map<String, String> addDataToFormFields(){
        Map<String, String> formFieldsToChange = new HashMap<String, String>();

        // add data to map to return
        formFieldsToChange.put("CharacterName", characterName);
        // since ClassLevel field is class and level, retrieve current class and add level to it
        formFieldsToChange.put("ClassLevel" , characterClass + " " + level);

        formFieldsToChange.put("Race ", race);
        formFieldsToChange.put("PlayerName" , playerName);

        return formFieldsToChange;
    }

    public void createPDF(String SRC, String DEST)  throws IOException{
        Map<String, String> formFieldsToChange = addDataToFormFields();

        new formFieldEditor().manipulatePdf(SRC, DEST, formFieldsToChange);
    }


}
