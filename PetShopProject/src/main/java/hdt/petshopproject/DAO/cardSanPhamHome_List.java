/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hdt.petshopproject.DAO;

import hdt.petshopproject.form.home.ListSanPham;
import hdt.petshopproject.form.home.cardSanPham;
import hdt.petshopproject.model.cardSanPhamHome;
import hdt.petshopproject.util.helper;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author akiLe
 */
public class cardSanPhamHome_List extends JPanel {

    public List<cardSanPhamHome> loadDataFromSQL() {
        List<cardSanPhamHome> listCardSanPham = new ArrayList<>();
        String sql = "select ID, Ten, giaTien, Loai from hangHoa";
        try (Connection con = helper.openConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                cardSanPhamHome cardSpHome = new cardSanPhamHome();
                cardSpHome.setLoaiDV(rs.getString("Loai"));
                cardSpHome.setTenDV(rs.getString("Ten"));
                cardSpHome.setIdDV(rs.getInt("ID"));
                cardSpHome.setGiaDV(rs.getInt("giaTien"));

                listCardSanPham.add(cardSpHome);

//                String tenDV = rs.getString("TenDV");
//                Double giaDV = rs.getDouble("GiaDV");
//                String idDV = rs.getString("IdDV");
//
//                cardSanPham cardSP = new cardSanPham(idDV, tenDV, giaDV);
//
//                ListSanPham listSanPham = new ListSanPham();
//                listSanPham.add(cardSP, BorderLayout.CENTER);
//                add(listSanPham); 
            }

        } catch (Exception e) {
            System.out.println("Loi SQL");
        }

        return listCardSanPham;
    }
}
