public class Archer extends User {

    //constructor
    public Archer(String newName) {
        name = newName;
        F_HEALTH = 150;
        health = 150;
        mvtrange = 3;
        atkrange = 5;
        defense = 20 
        F_DEF = 20 
        attack = 20 + (int) Math.random() * 45; 
        F_ATK = 20 + (int) Math.random() * 45; 
        //super("Archer", 150, 3, 5, 20, 20+ (int) Math.random()*45, 2);
        //name, health, mvtrange, atkrange, defense, attack, teamOrder
    }
    
    public String about() {
        return "Archers have a smaller movement range, but can attack accurately long distance. Their defense is not as high, however";
    }
   
    public void specialatk() {
       defense -= 20;
       attack += 20;
    }
    
    //normalatkk: prepares the Archer to perform a normal attack
    public void normalatk() {
        defense = F_DEFENSE;
        attack = F_ATTACK;
    }
}
