package DAO;

import Bean.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HomeDAO {
    public static List<Account> selectAccount(Connection conn){
        List<Account> list = new ArrayList<Account>();
        PreparedStatement ptmt =  null;
        String sql = "SELECT  * FROM account";

        try {
            ptmt = conn.prepareStatement(sql);
            ResultSet rs = ptmt.executeQuery();



            while (rs.next()){
                Account acc = new Account();
                String username = rs.getString("username");
                String password = rs.getString("password");
                acc.setUsername(username);
                acc.setPassword(password);
                list.add(acc);
            }

            ptmt.close();
            rs.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
}
