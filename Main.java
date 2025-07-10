
/**
 * Naming a Child Example 1.
 *
 * @author AM
 * @version 0
 */
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Naming a Child");
        
        // Instatiate the Class
        Baby child = new Baby();
        
        // Name the child to Lite
        System.out.println(child.nameChild("Lite"));
        
        // Ask the child the name
        System.out.println(child.sayYourName());
        
        
    }
    
}