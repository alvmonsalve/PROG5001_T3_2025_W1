
/**
 * Write a description of class Baby here.
 *
 * @author AM
 * @version 0
 */
public class Baby
{
    // instance variables - replace the example below with your own
    private int age;
    private String name; 

    /**
     * Constructor for objects of class Baby
     */
    public Baby()
    {
        // initialise instance variables
        age = 0;
        name = "";
    }

    /**
     * nameChild Method
     *
     * @param  newName  the name to be asigned to the baby
     * @return true if successful    
     */
    public Boolean nameChild(String newName)
    {
        // put your code here
        this.name = newName;
        return true;
    }
}