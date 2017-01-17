public class Archer extends User {

    //constructor
    public Archer(String newName) {
        super("Archer", 150, 3, 5, 20, 20+ (int) Math.random()*45, 2);
        //name, health, mvtrange, atkrange, defense, attack, teamOrder
    }
    
    public String about() {
        return "Archers have a smaller movement range, but can attack accurately long distance. Their defense is not as high, however";
    }
    
    public void specialatkk() {
       defense -= 20;
       attack += 20;
    }

    //normalatkk: prepares the Archer to perform a normal attack
    //sets defense to default value 40
    //sets strength to default value 100
    public void normalatkk() {
        defense = F_DEFENSE;
        strength = F_ATTACK;
    }
}
