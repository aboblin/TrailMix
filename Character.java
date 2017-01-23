import java.util.*;

public abstract class Character {

    //instance vars
    protected String name;
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
    
    public void move(int x, int y, Object[][] a){
        //use coordinates from the 2D ArrayList to input
        ArrayList placement = a[x][y];
        a[x][y] = a[currentX][currentY];
        a[currentX][currentY] = placement;
        setCoordinate(x, y);
    }
    
    public void attack(Character c){
        //use coordinates from the 2D ArrayList to input
    	c.lowerHP(attack);
    }
    
    public void lowerHP(int healthLost){
        health -= healthLost;
    }

    //about method (abstract)
    public abstract String about();
    
}
