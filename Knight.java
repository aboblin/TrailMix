public class Knight extends User {

    //constructor
    public Knight(String newName) {
        name = newName;
        F_HEALTH = 200;
        health = 200;
        mvtrange = 2;
        atkrange = 2;
        defense = 50 
        F_DEF = 50
        attack = 30 + (int) Math.random() * 45; 
        F_ATK = 30 + (int) Math.random() * 45; 
        //super("Knight", 150, 3, 5, 20, 20+ (int) Math.random()*45, 1);
        //name, health, mvtrange, atkrange, defense, attack, teamOrder
    }
    
    public String about() {
        return "Knights have a wider movement range, but can only attack those close to them. Their attacks are very powerful.";
    }
   

    public void specialatk() {
       defense -= 40;
       attack += 30;
    }

    //normalatkk: prepares the Knight to perform a normal attack
    //sets defense to default value
    //sets strength to default value
    public void normalatk() {
        defense = F_DEFENSE;
        strength = F_ATTACK;
    }
}
