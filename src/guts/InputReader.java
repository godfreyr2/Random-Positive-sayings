

package guts;

import java.util.Scanner;

/**
 *
 * @author ryan
 */
public class InputReader {
    private Scanner reader;
    
    /**
     * Create new InputReader that reads text from the terminal
     */
    public InputReader(){
        reader = new Scanner(System.in);
    }
    
    /**
     * 
     */
    public String getInput(){
        System.out.println("> ");
        String inputLine = reader.nextLine();
        
        return inputLine;
    }    
    
}
