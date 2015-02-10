import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle {
    ArrayList<String> words;
    String word = "test";
    char guessed;
    String wrongGuesses;
    
    public Puzzle(){
        try{
            File f = new File("words.txt");
            Scanner s = new Scanner(f);
            words = new ArrayList<String> ();
            char guess;
            while(s.hasNext()){
                words.add(s.nextLine());
            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void show(){
        System.out.print("\nPlease input your guess:");
        for(int i = 0; i < word.length(); i++){
            System.out.print("_");
        }
        
        System.out.print("\nWrong letters:");
        wrongGuesses = wrongGuesses += guessed;
        System.out.print(wrongGuesses);
    }

    public boolean isUnsolved(){
        return true;
    }

    public boolean makeGuess(String i){
        guessed = i;
        if(word.contains(i)){
            return true;
        }
        return false;
    }
    
    public String getWord(){
        return word;
    }
}