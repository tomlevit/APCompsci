import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle {
    ArrayList<String> words;
    String word;
    public String guessed = "";
    public String wrongGuesses = "";
    public int testLength;
	Random myRandomizer = new Random();

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
        testLength = 0;

        for(int n = 0; n < word.length(); n++){
            if(guessed.contains(word.charAt(n) + "")){
                System.out.print(word.charAt(n));
                testLength++;
            }else{
                System.out.print("_ ");
            }
        }
        System.out.print("\n" + testLength);
        System.out.print("\nWrong letters:");
        wrongGuesses = guessed;
        System.out.print(wrongGuesses);
    }

    public boolean isUnsolved(){
        if(testLength == word.length()) {
            return true;
        } else{
            return false;
        }
    }

    public boolean makeGuess(String i){
        guessed += i;
        for(int n = 0; n < guessed.length(); n++){
            if(word.contains(guessed.charAt(n) + "")){
                return true;
            }
        }        
        return false;
    }

    public String getWord(){
		word = list.get(myRandomizer.nextInt(list.size()));
        return word;
    }
}