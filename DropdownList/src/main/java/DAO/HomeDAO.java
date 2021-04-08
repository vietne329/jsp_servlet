package DAO;

import Bean.Province;
import Bean.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HomeDAO {

    public static List<Province> getProvincesList(Connection conn){
        List<Province> list = new ArrayList<Province>();

        PreparedStatement ptmt =null;
        String sql = "SELECT * FROM province";

        try {
            ptmt = conn.prepareStatement(sql);
            ResultSet rs = ptmt.executeQuery();

            while(rs.next()){
                Province p = new Province();
                int p_id = rs.getInt("id");
                String name = rs.getString("name");
                p.setId(p_id);
                p.setName(name);
                list.add(p);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return list;
    }

    public static boolean addStudent(Connection conn, Student stu){
        PreparedStatement ptmt = null;

        String sql =  "INSERT INTO student(name,provinceid) value (?,?)";

        try {
            ptmt = conn.prepareStatement(sql);
            String name = stu.getName();
            int province_id = stu.getProvince_id();
            ptmt.setString(1,name);
            ptmt.setInt(2,province_id);

            int check = ptmt.executeUpdate();

            if(check != 0){
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;

    }
}
