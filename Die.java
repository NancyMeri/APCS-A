//Nancy
import java.util.*;
public class Die
{
    private int dots;
    
    public void roll (){
        dots = (int) (Math.random() * 6) + 1;
    }
    public int getNumDots (){
        return dots;
    }
}
