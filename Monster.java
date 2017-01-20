public class Monster extends Character{

    public Monster(){
        name = "defaultMonster";
        F_HEALTH = 150;
        health = 150;
        mvtrange = 2;
        atkrange = 1;
        defense = 20 
        F_DEF = 20 
        attack = 20 + (int) Math.random() * 45; 
        F_ATK = 20 + (int) Math.random() * 45; 
        //super("defaultMonster", 150, 2, 1, 20, 20+ (int) Math.random()*45, 0);
    }

    public Monster(String Monsternum){
        super(Monsternum, 150, 2, 1, 20, 20+ (int) Math.random()*45, 0);
    }
    
    public String about(){
        return "How you gon' fight fire with fire?";
    }
    
    public void specialatk(){
        
    }
    
    //normalize: prepares monster to perform a normal attack
    //sets defense to default value 40
    //sets strength to default value 100
    public void normalatk(){
        
    }
    
}
