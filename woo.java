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
	private int numPlayers;
	private int numbMon;
	
	private InputStreamReader isr;
	private BufferedReader in;
    
	//DEFAULT CONSTRUCTOR
	public woo(){
		board = new Object[6][6];    
		numRounds = 0;
		numTurns = 0;
		gameover = false;
		isr = new InputStreamReader( System.in );
		in = new BufferedReader( isr );
		crtBoard();
		newGame();
		formation();
	}
        
	//METHODS~~~~~~~~~~~~~~~~~~~~~~~~~
	public void crtBoard(){
		for (int i =  0; i < board.length; i++){
			for (int j = 0; j < board[i].length; j++){
				if(i == 1){
					board[i][j] = "[--" + j + "--]";
				}
				else{
					board[i][j] = "[-----]";
				}
			}
		board[i][0] = "[--" + i + "--]";
        	}
	}
	
	public void print(Object[][] a) { 
		for(Object r[]: a){
			for(Object s: r){
				System.out.print(s);
			}
		System.out.println();
		}
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
		Character[] choicep1 = {new Knight("Player 1"), new Archer("Player 1"), new Healer("Player 1")};
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
		Character[] choicep2 = {new Knight("Player 2"), new Archer("Player 2"), new Healer("Player 2")};
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
		Character[] choicep3 = {new Knight("Player 3"), new Archer("Player 3"), new Healer("Player 3")};
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
        
	public void formation(){
		print(board);
		String s;
		s += "\n Where would you like your " + playerone.getName() + " ?";
		s += "\n Row: "
		int x = Integer.parseInt( in.readLine() );
		s += "\n Column: "
		int y = Integer.parseInt( in.readLine() );
		playerone.setCoordinate(x,y); //sets currentX and currentY (the coordinates)
		board[playerone.getX][playerone.getY] = "[" + playerone.getMark() + "-]";//makes a marker for where the character is on the board
	     
		s += "\n Where would you like your " + playertwo.getName() + " ?";
		s += "\n Row: "
		x = Integer.parseInt( in.readLine() );
		s += "\n Column: "
		y = Integer.parseInt( in.readLine() );
		playertwo.setCoordinate(x,y);
		board[playertwo.getX][playertwo.getY] = "[" + playertwo.getMark() + "-]";
	     
		s += "\n Where would you like your " + playerthree.getName() + " ?";
		s += "\n Row: "
		x = Integer.parseInt( in.readLine() );
		s += "\n Column: "
		y = Integer.parseInt( in.readLine() );
		playerthree.setCoordinate(x,y);
		board[playerthree.getX][playerthree.getY] = "[" + playerthree.getMark() + "-]";
	}
        
	public boolean playRound(){
		
	}
	
	public boolean playTurn(User player){
		String s;
		s = "\nWhere would you like to move?";
		s += "\nRow: ";
		int x = Integer.parseInt( in.readLine() );
		s += "\nColumn: ";
		int y = Integer.parseInt( in.readLine() );
		if(isinmvtRange(x,y)){
			player.move(x,y);
		}
		else{
			s += "\nNot in Range.";
			playTurn(player);
		} 
	}
	
	public boolean battle(Character playerone, Character wolf1) {
		int i = 1;
		int plydmg, mstrdmg;
		
		System.out.println( playerone.getName() + " instigates a battle with " + wolf1.getName() + "!" );
		
		while( wolf1.isAlive() && playerone.isAlive() ) {
			
			//get position of monsters
			//print board
			print(board);
			
			System.out.println( "\n" + playerone.getName() + ": HP=" + playerone.getHealth() + "/" + playerone.getFullHealth );
			System.out.println( "\n" + "wolf1.getName() + ":  HP=" + wolf1.getHealth() + "/" + wolf1.getFullHealth" );
			System.out.println( "\n Energy Pool: " + "/*energy pool now*/" + "/" + "fullEnergyPool");
			
			// Give user the option of using a special attack:
			try {
				System.out.println( "\How would you" + playerone.getClass + "like to fight?" );
				System.out.println( "\t1: Normal attack\n\t2: Special attack" ); //add energy pool decrements later
				i = Integer.parseInt( in.readLine() );
			}
			catch ( IOException e ) { }
			
			if ( i == 2 )
				playerone.specialatk();
			else
				pat.normalatk();
			
			d1 = playerone.attack( /*depending on whos in attack range*/);
			d2 = /*depending on who in battle w*/.attack( playerone );
			
			System.out.println( "\n" + playerone.getName() + " dealt " + d1 + " points of damage.");
			System.out.println( "\n" + wolf1.getName() + " clawed " + playerone.getName() + " for " + d2 + " points of damage.");
		}//end while
		
		//option 1: player char & monster perish
		if ( !wolf1.isAlive() && !playerone.isAlive() ) {
			System.out.println( playerone.getName() + " and wolf1 battled to the death");
			return false;
		}
		//option 2: player char kills the monster
		else if ( !wolf1.isAlive() ) {
			System.out.println( wolf1.getName() + " was slain by " + playerone.getName() );
			return true;
		}
		//option 3: monster kills player char
		else if ( !pat.isAlive() ) {
			System.out.println( wolf1.getName() + " killed " + playerone.getName() );
			return false;
		}
		
		return true;
	}//end battle()
	
        public static void main( String[] args ){
		woo whoop = new woo();
		
		while(playeron.isAlive() || playertwo.isAlive() || playerthree.isAlive()){
			if (!playGame())
				break;
		}
	}
}
