public class HangingMan {

    public int numWrongGuesses = 0;
    String[] HangmanImage = {   
            "+----+\n"+
            "|\n"+
            "|\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|    +\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|    +-\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|\n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|   / \n"+
            "/\\\n",

            "+----+\n"+
            "|    O\n"+
            "|   -+-\n"+
            "|   / \\\n"+
            "/\\\n",
        };

    
    public void show(){
        System.out.print(HangmanImage[numWrongGuesses]);
    }

    public void dieSomeMore(){
        System.out.print("\f" + HangmanImage[numWrongGuesses]);
        numWrongGuesses++;
    }

    public boolean isntDead(){
        if(numWrongGuesses == 6){
            return false;
        }else{
            return true;
        }
    }
}