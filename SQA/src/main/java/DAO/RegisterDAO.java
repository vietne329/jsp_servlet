package DAO;

import Bean.StudyClass;
import DB.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RegisterDAO {
    public static boolean addClassList(Connection conn,StudyClass sc){
        PreparedStatement ptmt = null;
        String sql ="INSERT INTO lophoc(tenlop,tenmonhoc,sotinchi,sokip,sotietlythuyet,sotietthuchanh) value(?,?,?,?,?,?)";

        try {
            ptmt = conn.prepareStatement(sql);
            String tenlop = sc.getTenlop();
            String tenmonhoc= sc.getTenmonhoc();
            int sotinchi = sc.getSotin();
            int sokip = sc.getSokip();
            int lythuyet = sc.getSokiplythuyet();
            int thuchhanh = sc.getSokipthuchanh();

            ptmt.setString(1,tenlop);
            ptmt.setString(2,tenmonhoc);
            ptmt.setInt(3,sotinchi);
            ptmt.setInt(4,sokip);
            ptmt.setInt(5,lythuyet);
            ptmt.setInt(6,thuchhanh);

            int check =ptmt.executeUpdate();

            if(check != 0){
                return true;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return false;
    }

    public static List<StudyClass> listClass(Connection conn){
        List<StudyClass>list =new ArrayList<StudyClass>();

        PreparedStatement ptmt = null;
        String sql ="SELECT * FROM lophoc";

        try {
            ptmt= conn.prepareStatement(sql);
            ResultSet rs = ptmt.executeQuery();

            while (rs.next()){
                StudyClass sc = new StudyClass();
                int id = rs.getInt("id");
                String tenlop = rs.getString("tenlop");
                String tenmonhoc =rs.getString("tenmonhoc");
                int sotin = rs.getInt("sotinchi");
                int sokip = rs.getInt("sokip");
                int lythuyet = rs.getInt("sotietlythuyet");
                int thuchanh = rs.getInt("sotietthuchanh");
                String thoigian = rs.getString("thoigian");

                sc.setId(id);
                sc.setTenlop(tenlop);
                sc.setTenmonhoc(tenmonhoc);
                sc.setSotin(sotin);
                sc.setSokip(sokip);
                sc.setSokiplythuyet(lythuyet);
                sc.setSokipthuchanh(thuchanh);
                sc.setThoigian(thoigian);
                list.add(sc);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return list;
    }

    public static boolean updateSchedule(Connection conn, StudyClass sc){
        PreparedStatement ptmt = null;
        String sql = "UPDATE lophoc SET tenlop = ?, tenmonhoc = ?, sotinchi = ?,  sotietlythuyet = ?, sotietthuchanh = ?, sokip = ? WHERE id = ?";

        try {
            ptmt = conn.prepareStatement(sql);
            ptmt.setString(1,sc.getTenlop());
            ptmt.setString(2,sc.getTenmonhoc());
            ptmt.setInt(3,sc.getSotin());
            ptmt.setInt(4,sc.getSokiplythuyet());
            ptmt.setInt(5,sc.getSokipthuchanh());
            ptmt.setInt(6,sc.getId());
            ptmt.setInt(7,sc.getSokip());
            int check = ptmt.executeUpdate();
            if(check != 0){
                return true;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;
    }

    public static int getIdSchedule(String tenlop, String tenmonhoc){
        int id = 0;
        Connection conn = DBConnection.CreateConnection();
        PreparedStatement ptmt;
        String sql = "SELECT id FROM lophoc WHERE tenlop = ? AND tenmonhoc = ?";
        try {
            ptmt =conn.prepareStatement(sql);
            ptmt.setString(1,tenlop);
            ptmt.setString(2,tenmonhoc);

            ResultSet rs = ptmt.executeQuery();
            while (rs.next()){
               id = rs.getInt("id");
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return id;
    }
//    public static boolean deleteSchedule(Connection conn){
//
//    };

}
