package DAO;

public class LoginDAO {
    public static boolean Validate(String username, String password){
        boolean t = false;

        if(username.equals("admin") && password.equals("123456")){
            t =true;
        }

        return t;
    }
}
