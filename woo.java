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
	printarray(board);
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
        Character[] school0 = {new User(), new Monster()};
        s += "\n\t1: Knight: " ;
        s += "\n\t2: Archer: " ;
        s += "\n\t3: Healer: " ;
        s += "\nSelection: ";
        System.out.println(s);
        
        try {
            playerone_class = Integer.parseInt( in.readLine() );
        }
        catch (IOException e) { }
        
        s += "\nPlease choose the class for your second character!";
        //default: archer
        int playertwo_class = 2;
        Character[] school1 = {new User(), new Monster()};
        s += "\n\t1: Knight: " ;
        s += "\n\t2: Archer: " ;
        s += "\n\t3: Healer: " ;
        s += "\nSelection: ";
        System.out.println(s);
        
        try {
            playertwo_class = Integer.parseInt( in.readLine() );
        }
        catch (IOException e) { }
        
        s += "\nPlease choose the class for your third character!";
        //default: healer
        int playerthree_class = 3;
        Character[] school2 = {new User(), new Monster()};
        s += "\n\t1: Knight: " ;
        s += "\n\t2: Archer: " ;
        s += "\n\t3: Healer: " ;
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
