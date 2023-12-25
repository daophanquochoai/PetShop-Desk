package hdt.petshopproject.DAO;

import hdt.petshopproject.model.cardSanPhamHome;
import hdt.petshopproject.util.helper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author akiLe
 */
public class cardSanPhamHome_List extends JPanel {
 
    public ArrayList<cardSanPhamHome> loadDataByLoai(String loai) {
        ArrayList<cardSanPhamHome> dataList = new ArrayList<>();

        String sql = "SELECT ID, Ten, giaTien, Loai FROM hangHoa";
        if (!"Tất cả".equals(loai)) {
            sql += " WHERE Loai = '" + loai + "'";
        }
        sql += " ORDER BY Loai";

        try (
            Connection con = helper.openConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql)
        ) {
            while (rs.next()) {
                cardSanPhamHome cardSpHome = new cardSanPhamHome();
                cardSpHome.setLoaiDV(rs.getString("Loai"));
                cardSpHome.setTenDV(rs.getString("Ten"));
                cardSpHome.setIdDV(rs.getInt("ID"));
                cardSpHome.setGiaDV(rs.getInt("GiaTien"));

                dataList.add(cardSpHome);
            }
        } catch (Exception e) {
            System.out.println("Lỗi SQL: " + e.getMessage());
        }

        return dataList;
    }
    
    public static ArrayList<cardSanPhamHome> loadDataByName(String name) {
        ArrayList<cardSanPhamHome> searchResults = new ArrayList<>();

        try (Connection connection = helper.openConnection()) {
            String sql = "SELECT Loai, Ten, giaTien, ID FROM hangHoa WHERE Ten LIKE ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, "%" + name + "%");

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        cardSanPhamHome cardSanPhamHome = new cardSanPhamHome();
                        cardSanPhamHome.setLoaiDV(resultSet.getString("Loai"));
                        cardSanPhamHome.setTenDV(resultSet.getString("Ten"));
                        cardSanPhamHome.setGiaDV(resultSet.getInt("giaTien"));
                        cardSanPhamHome.setIdDV(resultSet.getInt("ID"));

                        searchResults.add(cardSanPhamHome);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Loi SQL");
        }

        return searchResults;
    }
}
