import java.util.*;

public abstract class Character {

    //instance vars
    protected String name, marker;
    protected int health, mvtRange, atkRange, attack, defense, teamOrder, currentX, currentY;
    final protected int F_HEALTH; //full health
    final protected int F_DEF; //full defense
    final protected int F_ATK; //full attack
	
    //Accessor Methods	
    public int getHealth(){
        return health;
    }
    
    public int getFullHealth(){
	return F_HEALTH;
    }

    public int getDef(){
        return defense;
    }
    
    public int getFullDef(){
	return F_DEF;
    }

    public int getAttack(){
	return attack;
    }

    public int getFullAtk(){
	return F_ATK;
    }

    public int getOrder(){
        return teamOrder;
    }
    
    public int getmvtRange(){
        return mvtRange;
    }
    
    public int getatkRange(){
        return atkRange;
    }
	
    public int getX(){
	return currentX;
    }
    public int getY(){
        return currentY;
    }
	
    public String getMark(){
	return marker;
    }
	
    //Mutator Methods	
    public int setDef(int Def){
	defense = Def;
    }

    public int setAtk(int Atk){
	attack = Atk;
    }	
	
    public int setOrder(int placement){
	teamOrder = placement;
    }
	
    //Other Methods

    public boolean isAlive(){
        return health > 0;
    }
    
    public void setCoordinate(int x, int y){
        currentX = x;
        currentY = y;
    }
    
    public void move(int x, int y){
        //use coordinates from the 2D ArrayList to input
        board[x][y] = "[" + this.getMark() + "-]";
        board[currentX][currentY] = "[-----]";
        setCoordinate(x, y);
    }
    
    public void attack(Character c){
	int damage = (int)((str * dmg) - c.getDefense());
	if ( damage < 0 ){
	    damage = 0;
	}
	c.lowerHP(damage);
	return damage;
    }
    
    public void lowerHP(int healthLost){
        health -= healthLost;
    }

    //prints selection of monsters in attack range
    public static class inmvtRange(Character player){
        
    	//helper method isinmvtRange returns true if in movement range
	//this method loops to check for each monster that is alive's posistion and then System.out.println's the choice to fight them
    	int numinrange = 0;
    	System.out.println("0. do no attack");
    
    	for(int i; i < numMon; i++){
		if (player.isinmvtRange(/*name of monster*/)){
			numinrange++;
			System.out.println( numinrange + ". " + /*monster name*/);
		}
	}
    }
            
            
    //helper function for ismvtRange
    //checks monsters position and compares it to the player's attack range
    public boolean isinmvtRange(int x, int y,){
	for(int i; i < this.getmvtRange(); i++){
		if(this.getX() == x && this.getY() + i == y)
			return true;
		if(this.getX() + i == x && this.getY() == y){
			return true;
	}
        return false;
     }          

    //about method (abstract)
    public abstract String about();
    
}
