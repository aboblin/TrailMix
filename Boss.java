public class Boss extends Monster {

    //constructor
    public Boss(String newName) {
        super("Boss", 150, 2, 3, 40, 40+ (int) Math.random()*45, 3);
        //name, health, mvtrange, atkrange, defense, attack, teamOrder
    }
    
    public String about() {
        return "You can't fight as a boss. The fules of the universe won't allow for it.";
    }
/*-----------------------------------
    public void specialatk() {
       defense -= 30;
       attack += 30;
    }
-----------------------------------*/
    //normalatkk: prepares the Archer to perform a normal attack
    //sets defense to default value 40
    //sets strength to default value 100
    public void normalatk() {
        defense = F_DEFENSE;
        attack = F_ATTACK;
    }
}
