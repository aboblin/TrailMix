public class Character {

    //instance vars
    protected String name;
    protected int health;
    final protected int F_HEALTH; //full health
    protected int mvtRange;
    protected int atkRange;
    protected int defense;
    final protected int F_DEF; //full defense
    protected int attack;
    final protected int F_ATK; //full attack
    protected int teamOrder;
    protected int currentX;
    protected int currentY;
    
    public Character(String nam, int hp, int mvt, int atkrang, int defrang, int atk, int teamOdr){
        name = nam;
        health = hp;
        mvtRange = mvt;
        atkRange = atkrang;
        defense = defrang;
        attack = atk;
        teamOrder = teamOdr;
    }
    
    public boolean isAlive(){
        return health > 0;
    }
    
    public void getCoordinate(int x, int y){
        currentX = x;
        currentY = y;
    }
    
    public void move(int x, int y, ArrayList[][] a){
        //use coordinates from the 2D ArrayList to input
        Object placement = a[x][y];
        a[x][y] = a[currentX][currentY];
        a[currentX][currentY] = placement;
        currentX = x;
        currentY = y;
    }
    
    /* public void attack(int x, int y, ArrayList[][] a){
        //use coordinates from the 2D ArrayList to input
    
    } */
    
    public void lowerHP(int healthLost){
        health -= healthLost;
    }
    
    public int getHealth(){
        return health;
    }
    
    public int getDef(){
        return defense;
    }
    
    public int getOrder(){
        return teamOrder;
    }
    
    public int getmvtRange(){
        return mvtRangel
    }
    
    public int getatkRange(){
        return atkRange;
    }
    
    //normalize method
    public abstract void normalize();

    //specialize method
    public abstract void specialize();
    
    //about method
    public abstract String about();
    
}