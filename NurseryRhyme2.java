//Nancy
/*Use a for loop to print out all the lyrics of 99 bottles of milk 
 * on the wall. You can use digits in your lyric output.
 */

public class NurseryRhyme2
{
    public static void main (String [] args){
        for (int i = 99; i > 1; i--){
            System.out.println(i + " bottles of milk on the wall, " +
            i + "bottles of milk.");
            System.out.println(" Take one down and pass it around, " +
            (i-1) + " bottles of milk on the wall.");
        }
        System.out.println("1 bottle of milk on the wall, 1 bottle of milk.");
        System.out.println("Take one down and pass it around, " +
        "no more bottles of milk on the wall.");
        System.out.println("No more bottles of milk on the wall, " +
        "no more bottles of milk.");
        System.out.println("Go to the store and buy some more, " +
        "99 bottles of milk on the wall.");
    }
}
