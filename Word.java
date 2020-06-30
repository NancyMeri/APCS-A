//Nancy
import java.util.*;
public class Word
{
    private String word;
    private String definition;
    
    public Word (String w, String d){
        word = w;
        definition = d;
    }
    public void setWord (String w){
        word = w;
    }
    public void setDef (String d){
        definition = d;
    }
    public String getWord(){
        return word;
    }
    public String getDef(){
        return definition;
    }
    public String toString(){
        return word.concat(" " + definition);
    }
}
