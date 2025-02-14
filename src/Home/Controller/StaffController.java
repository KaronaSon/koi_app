package Home.Controller;

import Components.AlertMessager;
import DataBase.DBConnector;
import Home.Model.StaffModel;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class StaffController extends DBConnector {

    PreparedStatement ps;
    ResultSet rs;
    private String sql;
    private Object employee;

    public Collection<StaffModel> getData() {
        List<StaffModel> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM tbl_Staff";
            ps = connector("db_Koi").prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                StaffModel emp = new StaffModel(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("gender"),
                        rs.getInt("age"),
                        rs.getString("position"),
                        rs.getDouble("salary"),
                        rs.getString("contact"),
                        rs.getString("image"),
                        rs.getString("date")
                );
                list.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void addStaffToDB(StaffModel staff) {
        try {
            String sql = "INSERT INTO `tbl_Staff`( `name`, `gender`, `age`, `position`, `salary`, `contact`, `image`, `date`) VALUES (?,?,?,?,?,?,?,?)";
            ps = connector("db_Koi").prepareStatement(sql);
            ps.setString(1, staff.getName());
            ps.setString(2, staff.getGender());
            ps.setInt(3, staff.getAge());
            ps.setString(4, staff.getPosition());
            ps.setDouble(5, staff.getSalary());
            ps.setString(6, staff.getContact());
            ps.setString(7, staff.getImage());
            ps.setString(8, staff.getDate());

            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Add staff to db successfully");
            } else {
                AlertMessager.error("Staff can't be add");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStaffDB(StaffModel staff) {
        try {
            String sql = "UPDATE `tbl_Staff` SET `name`=?,`gender`=?,`age`=?,`position`=?,`salary`=?,`contact`=?,`image`=?,`date`=? WHERE id= ?";
            ps = connector("db_Koi").prepareStatement(sql);
            ps.setString(1, staff.getName());
            ps.setString(2, staff.getGender());
            ps.setInt(3, staff.getAge());
            ps.setString(4, staff.getPosition());
            ps.setDouble(5, staff.getSalary());
            ps.setString(6, staff.getContact());
            ps.setString(7, staff.getImage());
            ps.setString(8, staff.getDate());
            ps.setInt(9, staff.getId());
            int i=ps.executeUpdate();
            if(i>0){
                AlertMessager.success("Update Success");
            }else{
                AlertMessager.error("Update not success");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

   public void deleteStaff(int id){
        try {
            String sql="DELETE FROM`tbl_Staff`WHERE `id`=?";
            ps = connector("db_Koi").prepareStatement(sql);
            ps.setInt(1, id);
            int i=ps.executeUpdate();
            if(i>0){
                AlertMessager.success("Delete Success");
            }else{
                AlertMessager.error("Delete not success");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
   }
   public int getTotalStaff(){
       int count=0;
       
        try {
            String sql="SELECT `id` FROM `tbl_Staff` ";
            ps=connector("db_Koi").prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                count++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
       return count;
   }
    public int getTotalMale(){
       int count=0;
       
        try {
            String sql="SELECT `id` FROM `tbl_Staff` ";
            ps=connector("db_Koi").prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                count++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
       return count;
   }
    public int getTotalFemale(){
       int count=0;
       
        try {
            String sql="SELECT `id` FROM `tbl_Staff` ";
            ps=connector("db_Koi").prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                count++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
       return count;
   }
    public int getTotalSalary(){
       int count=0;
       
        try {
            String sql="SELECT `id` FROM `tbl_Staff` ";
            ps=connector("db_Koi").prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                count++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
       return count;
   }
}
