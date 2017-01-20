public class Healer extends User {

    //constructor
    public Healer(String newName) {
        name = newName;
        F_HEALTH = 100;
        health = 100;
        mvtrange = 6;
        atkrange = 5;
        defense = 5 
        F_DEF = 5
        attack = 0 
        F_ATK = 0
        //super("Healer", 150, 6, 5, 5, 0, 3);
        //name, health, mvtrange, atkrange, defense, attack, teamOrder
    }
    
    public String about() {
        return "Healers can only either heal their teammates in their range or replenish their energy pool. They have a wide movement range but a low defense.";
    }
    
    public void replenishEP() {
     //  energypool = R_ENERGYPOOL;
    }

    //healPlayer: player's defense, attack, and health is healed
    public void healPlayer() {
        
    }
}
