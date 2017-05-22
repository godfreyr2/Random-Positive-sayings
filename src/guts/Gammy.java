/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guts;

/**
 *
 * @author ryan
 */
public class Gammy {
    private InputReader reader;
    private Responder responder;
   
    /**
     * 
     */
    public Gammy(){
        reader = new InputReader();
        responder = new Responder();
        
        }
    
    /**
     * 
     */
    public void start(){
        
        boolean finished = false;
        
        printWelcome();
        
        while(!finished){
            String input = reader.getInput();
            if(input.startsWith("bye") || input.startsWith("later")|| input.startsWith("see ya")){
                finished = true;
            }
            else{
                String response = responder.generateResponse();
                System.out.println(response);
                
            }
        }
        printGoodbye();
    }
    
    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome()
    {
        
        System.out.println("Hi I'm Gammy.  Ask me a question?");
        System.out.println();
        System.out.println("You may not like it, but I'll give you the answer.");
        System.out.println();
        System.out.println("Please type 'bye' when you're done\n"
                + "so I can get back to my nap.  ");
        
        
    }
    
    /**
     * 
     */

    
    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye()
    {
        System.out.println("Nice talking to you. Bye...");
    }
    
}
