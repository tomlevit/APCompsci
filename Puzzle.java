import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle {
    ArrayList<String> words;
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
        for(int i = 0; i < words.size(); i++){
            System.out.print("_");
        }
        System.out.print("\nPlease input your guess:");

        System.out.print("\nWrong letters:");
    }

    public boolean isUnsolved(){
        return true;
    }

    public void makeGuess(){
        
    }
}