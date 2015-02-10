public class HangingMan {

    private int numWrongGuesses;
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

    int t = 0;
    public void show(){
        System.out.print(HangmanImage[t]);
    }

    public void dieSomeMore(){
        System.out.print("\f" + HangmanImage[t]);
        t++;
    }

    public boolean isntDead(){
        if(numWrongGuesses == 7)
            return false;
        return true;
    }
}