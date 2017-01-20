public class Boss extends Monster {

    //constructor
    public Boss(String newName) {
        name = newName;
        F_HEALTH = 300;
        health = 300;
        mvtrange = 3;
        atkrange = 5;
        defense = 30 
        F_DEF = 30 
        attack = 25 + (int) Math.random() * 45; 
        F_ATK = 25 + (int) Math.random() * 45; 
        //super("Boss", 150, 2, 3, 40, 40+ (int) Math.random()*45, 3);
        //name, health, mvtrange, atkrange, defense, attack, teamOrder
    }
    
    public String about() {
        return "You can't fight as a boss. The fules of the universe won't allow for it.";
    }

    public void specialatk() {
       defense -= 30;
       attack += 30;
    }

    //normalatkk: prepares the Archer to perform a normal attack
    public void normalatk() {
        defense = F_DEFENSE;
        attack = F_ATTACK;
    }
}
