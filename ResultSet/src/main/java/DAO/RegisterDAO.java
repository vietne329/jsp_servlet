package DAO;

import Bean.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDAO {
    public static boolean insertAccount(Connection conn, Account acc){
        PreparedStatement ptmt =  null;
        String sql = "INSERT INTO account(username,password) values(?,?)";

        try {
            ptmt = conn.prepareStatement(sql);

            String uname =  acc.getUsername();
            String pass = acc.getPassword();

            ptmt.setString(1,uname);
            ptmt.setString(2,pass);

            int check = ptmt.executeUpdate();

            if(check != 0){
                return true;
            }

            ptmt.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }
}
