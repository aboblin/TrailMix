public class Archer extends User {

    //constructor
    public Archer(String newName) {
        super("Archer", 150, 6, 5, 5, 0, 3);
        //name, health, mvtrange, atkrange, defense, attack, teamOrder
    }
    
    public String about() {
        return "Healers can only either heal their teammates in their range or replenish their energy pool. They have a wide movement range but a low defense.";
    }
    
    public void replenishEP() {
       energypool = R_ENERGYPOOL;
    }

    //healPlayer: player's defense, attack, and health is healed
    public void healPlayer() {
        
    }
}
