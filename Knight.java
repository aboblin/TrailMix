public class Knight extends User {

    //constructor
    public Knight(String newName) {
        super("Knight", 150, 3, 5, 20, 20+ (int) Math.random()*45, 1);
        //name, health, mvtrange, atkrange, defense, attack, teamOrder
    }
    
    public String about() {
        return "Knights have a wider movement range, but can only attack those close to them. Their attacks are very powerful.";
    }
/*-----------------------------------    

    public void specialatkk() {
       defense -= 20;
       attack += 20;
    }
-----------------------------------*/
    //normalatkk: prepares the Knight to perform a normal attack
    //sets defense to default value
    //sets strength to default value
    public void normalatk() {
        defense = F_DEFENSE;
        strength = F_ATTACK;
    }
}
