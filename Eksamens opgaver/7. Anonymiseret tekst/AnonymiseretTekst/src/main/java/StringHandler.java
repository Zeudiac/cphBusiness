import java.util.ArrayList;

public class StringHandler {
    public String replaceText(String text, ArrayList<String> students,ArrayList<String> genders){
        //Anonymiser studentens navn
        for (String s: students){
                text=text.replace(s,"den studerende");
        }
        //Anonymiser studentens køn
        for (String s: genders){
            text=text.replace(s,"vedkommende");
        }
        return text;
    }
}
