public class User extends Character{

    public User(){
        super("defaultUser", 150, 2, 1, 20, 20+ (int) Math.random()*45, 0);
    }

    public User(String Usernum){
        super(Usernum, 150, 2, 1, 20, 20+ (int) Math.random()*45, 0);
    }
    
    public void specialatk(){
        
    }
    
    //normalize: prepares the Warrior to perform a normal attack
    //sets defense to default value 40
    //sets strength to default value 100
    public void normalatk(){
        
    }
    
}
