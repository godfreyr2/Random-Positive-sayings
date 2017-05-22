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
public class SupportSystem {
    private InputReader reader;
    private Responder responder;
    
    /**
     * 
     */
    public SupportSystem(){
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
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }

    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye()
    {
        System.out.println("Nice talking to you. Bye...");
    }
}
    
    
