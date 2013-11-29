/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author zvibock
 */
public class Hangman {

    public static String[] words = {"airplane","land","bear","follow","cable","table","warrior ","describe","glasses","borrow","carton","garbage","house", "people", "pizza","race","practice"};
    public int outs = 0;
    public char[] guesses;
    public int end = 0;
    public char guess;
    public char score;
    public boolean[] records = new boolean[26];
    public Hangman() {
    }

    public void drawGuesses() {
        for (int i = 0; i < guesses.length; i++) {
            String x = " _ ";
            if (guesses[i] == 0) {
                System.out.print(" _ ");
            } else {
                System.out.print(" " + guesses[i] + " ");
            }

        }
        System.out.println();
    }

    public void outs() {
        System.out.println("you have used " + outs + " guesses ");
        System.out.println("you have up to 12 guesses");
    }

    /**
     *
     */
    public void end() {
      
        
        if (guesses.length == end) {
            System.out.print("you won");
            System.exit(1);
        }
    }

    public boolean isItScore() {
        if (score == guess) {
            return false;
        }
        return true;
    }

    public void start() {
        int number = new Random().nextInt(words.length);
        String theWord = words[number].toLowerCase();
        guesses = new char[theWord.length()];
        Scanner scanner = new Scanner(System.in);

        while (outs < 12) {
            drawGuesses();
            outs();
            System.out.print("guess a letter:");
            guess = scanner.next().toLowerCase().charAt(0);
              
            end();
            //outs();
            if(records[guess-'a']){
                continue;
            }else{
              records[guess-'a']=true;}
          
            //end();
            //outs();
           /* if(records[guess-'a']){
                continue;
            }else{
              records[guess-'a']=true;*/

            for (int i = 0; i < guesses.length; i++) {
                if (theWord.charAt(i) == guess) {
                    end++;
                    guesses[i] = guess;
                    score = guesses[i];
                }
            }
            if (isItScore()) {
                outs++;

               


            }
        }
        System.out.print("you lost the word was  " + theWord);
    }
   
    
        
    
    
            
    

    public static void main(String[] args) {
        Hangman hangman = new Hangman();
        hangman.start();

    }
}
