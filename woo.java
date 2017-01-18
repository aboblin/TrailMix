import java.io.*;
import java.util.*;
import cs1.Keyboard;


public class woo{

    private int level;
    private Object[][] board;
    private int numRounds;
    private int numTurns;
    private boolean gameover;
    private int viewrules;

    private Character playerone;
    private Character playertwo;
    private Character playerthree;
    
    private InputStreamReader isr;
    private BufferedReader in;
    
    //DEFAULT CONSTRUCTOR
    public woo(){
        board = new Object[5][5];    
        numRounds = 0;
        numTurns = 0;
        gameover = false;
        for (int i =  0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                board[i][j] = "x";
            }
        }
        isr = new InputStreamReader( System.in );
        in = new BufferedReader( isr );
	System.out.println(printarray(board));
	newGame();
    }
        
    //METHODS~~~~~~~~~~~~~~~~~~~~~~~~~
    public String printarray( Object[][] a ){
	String retStr = "";
        for(Object[] i : a){
	    retStr +="{";
	    for(Object x : i){
		retStr += x + ",";
	    }
	    retStr = retStr.substring(0,retStr.length()-1);
	    retStr +="}\n";
	}
	return retStr;
    }
	
    public void newGame(){
        String s;
        String name = "";
        s = "WELCOME TO TEAM TRAILMIX's GAME!!!";
        
        s += "\nWould you like to view the rules of the game?";
        s += "\n1. Yes";
        s += "\n2. No";
        s += "\nSelection: ";
        System.out.println(s);
        
        try {
            viewrules = Integer.parseInt( in.readLine() );
        }
        catch ( IOException e ) { }
        
        
        //CHARACTER CLASSES------------------------------------
        s = "You have three characters to play with!";
        
        s += "\nPlease choose the class for your first character!";
        //default: knight
        int playerone_class = 1;
        Character[] choicep1 = {new Character.User.Knight("Player 1"), new Character.User.Archer("Player 1"), new Character.User.Healer("Player 1")};
        s += "\n\t1: Knight: " + choicep1[0].about();
        s += "\n\t2: Archer: " + choicep1[1].about();
        s += "\n\t3: Healer: " + choicep1[2].about();
        s += "\nSelection: ";
        System.out.println(s);
        
        try {
            playerone_class = Integer.parseInt( in.readLine() );
        }
        catch (IOException e) { }
        
        s += "\nPlease choose the class for your second character!";
        //default: archer
        int playertwo_class = 2;
        Character[] choicep2 = {new Character.User.Knight("Player 2"), new Character.User.Archer("Player 2"), new Character.User.Healer("Player 2")};
        s += "\n\t1: Knight: " + choicep2[0].about();
        s += "\n\t2: Archer: " + choicep2[1].about();
        s += "\n\t3: Healer: " + choicep2[2].about();
        s += "\nSelection: ";
        System.out.println(s);
        
        try {
            playertwo_class = Integer.parseInt( in.readLine() );
        }
        catch (IOException e) { }
        
        s += "\nPlease choose the class for your third character!";
        //default: healer
        int playerthree_class = 3;
        Character[] choicep3 = {new Character.User.Knight("Player 3"), new Character.User.Archer("Player 3"), new Character.User.Healer("Player 3")};
        s += "\n\t1: Knight: " + choicep3[0].about();
        s += "\n\t2: Archer: " + choicep3[1].about();
        s += "\n\t3: Healer: " + choicep3[2].about();
        s += "\nSelection: ";
        System.out.println(s);
        
        try {
            playerthree_class = Integer.parseInt( in.readLine() );
        }
        catch (IOException e) { }
        
        //-------------------------------------------------
        
        }//end of newGame
        
        public void roundOrder(){
       
        }    
        
        public static void main( String[] args ){
	    woo whoop = new woo();
        }
}
