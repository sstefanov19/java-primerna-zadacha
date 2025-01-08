public class Admin extends User{

    public Admin(String userName , String password) { super(userName , password);}

    @Override
    public  UserType getUserType(){return UserType.ADMIN;}
}
