public abstract class User extends Character{
    /*------------------------------------
    public User(){
        super("defaultUser", 150, 2, 1, 20, 20+ (int) Math.random()*45, 0);
    }

    public User(String Usernum){
        super(Usernum, 150, 2, 1, 20, 20+ (int) Math.random()*45, 0);
    }
    --------------------------------------*/
    public String getName(){
        return name;
    }
    public abstract void heal();
    public abstract void specialize();
    public abstract void normalize();
    public abstract String about();
    
}
