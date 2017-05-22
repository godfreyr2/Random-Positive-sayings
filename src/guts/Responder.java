/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guts;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ryan
 */
public class Responder {
    private Random randomGenerator;
    private ArrayList<String> responses;
    private ArrayList<String> randomPonderings;
    
    
    /**
     * 
     */
    public Responder(){
        randomGenerator = new Random();
        responses = new ArrayList<String>();
        randomPonderings = new ArrayList<String>();
        fillResponses();
        fillRandomPonderings();
        
    }
    
    
    /**
     * 
     */
    public String generateResponse(){
        int index = randomGenerator.nextInt(responses.size());
        return responses.get(index);
    }
    
    /**
     * 
     */
    public String generateRandomPondering(){
        int index = randomGenerator.nextInt(randomPonderings.size());
        return randomPonderings.get(index);
    }
    
    /**
     * 
     */
    private void fillResponses(){
        responses.add("Do or do not, there is not try.\n\n-Master Yoda");
        responses.add("Life is good!");
        responses.add("Don't worry be happy.");
        responses.add("It's never as good as it seems,and it's never as bad\n"
                + "as it seems.");
        responses.add("There can be no positive result through negative attitude.\n"
                + "Think positive. Live positive.\n\n-RVM");
        responses.add("Things turn out best for people who make the best out\n"
                + "of the way things turned out.");
        responses.add("When one door of happiness closes, another opens; but\n"
                + " often we look so long at the closed door that we do not see\n"
                + "the one which has been opened.");
        responses.add("It is a positive attitude towards life that make\n"
                + "dreams come true.");
        responses.add("Don't cry because it's over, SMILE because it happened.\n\n"
                + "-Dr. Seuss");
        responses.add("You're good enough, smart enough, and gosh darnit\n"
                + "people like you.");
        responses.add("Sometimes you win, and sometimes you learn.\n"
                + "There are NO loosing situations.\n\n-Ryan M. Godfrey");
        responses.add("Whatever you are - be a good one.\n\n"
                + "- A. Lincoln");
        
    }
    
    /**
     * 
     */
    private void fillRandomPonderings(){
        randomPonderings.add("If you think the earth is flat there is only one\n"
                + "underlying problem.  It's the fact that you're not smart\n"
                + "enough to know what you don't know. If you were smart\n"
                + "enough you would know just how ridiulous you really are.");
        randomPonderings.add("Did you know that your cast iron pot came from\n"
                + "the last moments of a star before it blows up.");
        randomPonderings.add("I think smartphones have made us all a little\n"
                + "dumber as a society.  Never underestimate\n"
                + "the power of giving all of the stupid people\n"
                + "the means to communicate");
        randomPonderings.add("What if the letters 'C A T' spelled dog?");
    }
}
