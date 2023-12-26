package hdt.petshopproject.DAO;

import hdt.petshopproject.model.DoanhThu;
import hdt.petshopproject.model.hoaDon;
import hdt.petshopproject.util.helper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class hoaDon_List {

    public List<hoaDon> getAll() throws Exception {
        String sql = "SELECT Bill.ID_HD as iD, CONCAT(khachHang.ho, ' ', khachHang.ten) AS HoTen, Bill.NgMua as ngayMua, sum(hangHoa.giaTien) AS tongTien FROM Bill JOIN khachHang ON Bill.ID_KH = khachHang.ID JOIN chiTietDonHang ON chiTietDonHang.ID_HD = Bill.ID_HD JOIN hangHoa ON hangHoa.ID = chiTietDonHang.ID_HH GROUP BY Bill.ID_HD, CONCAT(khachHang.ho, ' ', khachHang.ten), Bill.NgMua order by Bill.ID_HD";
        List<hoaDon> listHD = new ArrayList<>();
        try (
                Connection con = helper.openConnection(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql);) {
            while (rs.next()) {
                hoaDon hd = new hoaDon();
                hd.setIdHD(Integer.parseInt(rs.getString("iD")));
                hd.setTenKH(rs.getString("HoTen"));
                hd.setNgTao(rs.getString("ngayMua"));
                hd.setThanhTien(Integer.parseInt(rs.getString("tongTien")));
                listHD.add(hd);
            }
            return listHD;
        }
    }

    public int getTien(int ID) throws Exception {
        String sql = "SELECT  sum(hangHoa.giaTien) AS tongTien \n"
                + "FROM Bill JOIN khachHang ON Bill.ID_KH = khachHang.ID \n"
                + "JOIN chiTietDonHang ON chiTietDonHang.ID_HD = Bill.ID_HD \n"
                + "JOIN hangHoa ON hangHoa.ID = chiTietDonHang.ID_HH \n"
                + "where Bill.ID_HD = ?";
        try (
                Connection con = helper.openConnection(); PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, String.valueOf(ID));
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                return rs.getInt("tongTien");
            } else {
                return 0;
            }
        }
    }
//    //them hoa don
//    public boolean insert(hoaDon hd) throws Exception{
//        String sql = "insert into hangDon(ID_HD,ID_HH, ID_NV, ID_KH, soLuong) values (?,?,?,?,?);";
//        try (
//                Connection con = helper.openConnection();  
//                PreparedStatement pstm = con.prepareStatement(sql);) 
//        {
//            pstm.setString(1, String.valueOf(hd.getIdHD()));
//            pstm.setString(2,String.valueOf(hd.getIdHH()));
//            pstm.setString(3, String.valueOf(hd.getIdNV()));
//            pstm.setString(4,String.valueOf(hd.getIdKH()));
//            pstm.setString(5,String.valueOf(hd.getSoLuong()));
//            return pstm.executeUpdate() > 0;
//        }
//    }

//    //cap nhat hoa don
//    public boolean update(hoaDon hd) throws Exception {
//        String sql = "Update hoaDon set ID_HD=?, ID_HH=?, ID_NV=?, ID_KH=?, soLuong=?";
//        try (
//                Connection con = helper.openConnection();  
//                PreparedStatement pstm = con.prepareStatement(sql);) 
//        {
//            pstm.setString(1, String.valueOf(hd.getIdHD()));
//            pstm.setString(2,String.valueOf(hd.getIdHH()));
//            pstm.setString(3, String.valueOf(hd.getIdNV()));
//            pstm.setString(4,String.valueOf(hd.getIdKH()));
//            pstm.setString(5,String.valueOf(hd.getSoLuong()));
//            return pstm.executeUpdate() > 0;
//        }
//    }
    // tim kiem theo ten
    public List<hoaDon> findByTen(String ten) throws Exception {
        String sql = "SELECT Bill.ID_HD as iD, CONCAT(khachHang.ho, ' ', khachHang.ten) AS HoTen, Bill.NgMua as ngayMua, SUM(chiTietDonHang.soLuong * hangHoa.giaTien) AS tongTien FROM Bill JOIN khachHang ON Bill.ID_KH = khachHang.ID JOIN chiTietDonHang ON chiTietDonHang.ID_HD = Bill.ID_HD JOIN hangHoa ON hangHoa.ID = chiTietDonHang.ID_HH where concat(lower(khachHang.ho),' ', lower(khachHang.ten)) like ? GROUP BY Bill.ID_HD, CONCAT(khachHang.ho, ' ', khachHang.ten), Bill.NgMua;";
        List<hoaDon> listHD = new ArrayList<>();
        try (
                Connection con = helper.openConnection(); PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, "%" + ten + "%");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                hoaDon hd = new hoaDon();
                hd.setIdHD(Integer.parseInt(rs.getString("iD")));
                hd.setTenKH(rs.getString("hoTen"));
                hd.setNgTao(rs.getString("ngayMua"));
                hd.setThanhTien(Integer.parseInt(rs.getString("tongTien")));
                listHD.add(hd);
            }
            return listHD;
        }
    }

    //xoa hoa don
    public boolean delete(int id) throws Exception {
        String sql = "delete from Bill where ID_HD= ?";
        try (
                Connection con = helper.openConnection(); PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, String.valueOf(id));
            return pstm.executeUpdate() > 0;
        }

    }

    public List<hoaDon> sapXepTen() throws Exception {
        String sql = "SELECT Bill.ID_HD as iD, CONCAT(khachHang.ho, ' ', khachHang.ten) AS HoTen, Bill.NgMua as ngayMua, SUM(chiTietDonHang.soLuong * hangHoa.giaTien) AS tongTien FROM Bill JOIN khachHang ON Bill.ID_KH = khachHang.ID JOIN chiTietDonHang ON chiTietDonHang.ID_HD = Bill.ID_HD JOIN hangHoa ON hangHoa.ID = chiTietDonHang.ID_HH GROUP BY Bill.ID_HD, CONCAT(khachHang.ho, ' ', khachHang.ten), Bill.NgMua order by Bill.ID_HD  order by HoTen";
        List<hoaDon> listHD = new ArrayList<>();
        try (
                Connection con = helper.openConnection(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql);) {
            while (rs.next()) {
                hoaDon hd = new hoaDon();
                hd.setIdHD(Integer.parseInt(rs.getString("iD")));
                hd.setTenKH(rs.getString("hoTen"));
                hd.setNgTao(rs.getString("ngayMua"));
                hd.setThanhTien(Integer.parseInt(rs.getString("tongTien")));
                listHD.add(hd);
            }
            return listHD;
        }
    }

    public List<Integer> getNam() throws Exception {
        String sql = "SELECT \n"
                + "    YEAR(b.NgMua) AS Nam\n"
                + "FROM Bill b\n"
                + "GROUP BY YEAR(b.NgMua)\n"
                + "ORDER BY Nam;";
        try (
                Connection con = helper.openConnection(); PreparedStatement pstm = con.prepareStatement(sql);) {

            ResultSet rs = pstm.executeQuery();
            List<Integer> Nam = new ArrayList<>();
            while (rs.next()) {
                Nam.add(rs.getInt("Nam"));
            }
            return Nam;
        }

    }

    public List<DoanhThu> getThang(int nam) throws Exception {
        String sql = "SELECT \n"
                + "    month(b.NgMua) AS thang,\n"
                + "	sum(h.giaTien) as doanhthu\n"
                + "FROM Bill b, chiTietDonHang c, hangHoa h\n"
                + "where b.ID_HD=c.ID_HD and c.ID_HH=h.ID and year(b.NgMua) = ?\n"
                + "GROUP BY month(b.NgMua)\n"
                + "ORDER BY thang";
        try (
                Connection con = helper.openConnection(); PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, String.valueOf(nam));
            ResultSet rs = pstm.executeQuery();
            List<DoanhThu> Thang = new ArrayList<>();
            while (rs.next()) {
                DoanhThu doanhThu = new DoanhThu();
                doanhThu.setFirst(rs.getInt("thang"));
                doanhThu.setSecond(rs.getInt("doanhthu"));
                Thang.add(doanhThu);
            }
//            System.out.print(Thang.size());
//            for(int i=0;i<Thang.size();i++){
//               System.out.print("\n" + Thang.get(i).getFirst()+" " +Thang.get(i).getSecond());
//            }
            return Thang;
        }

    }

//    public int soHD() throws Exception {
//        String sql = "select count(*) as 'Sohoadon'\n"
//                + "from Bill";
//        try (
//            Connection con = helper.openConnection(); PreparedStatement pstm = con.prepareStatement(sql);) {
//            ResultSet rs = pstm.executeQuery();
//            if (rs.next()) {
//                return rs.getInt("Sohoadon");
//            }else{
//                return 0;
//            }
//        }
//    }
}
