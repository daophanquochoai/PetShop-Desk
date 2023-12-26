
package hdt.petshopproject.model;

/**
 *
 * @author akiLe
 */

public class cardSanPhamHome {
    private String loaiDV;
    private String tenDV;
    private int giaDV;
    private int idDV;
    private boolean trangThai;

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
    public String getLoaiDV() {
        return loaiDV;
    }

    public void setLoaiDV(String loaiDV) {
        this.loaiDV = loaiDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public int getGiaDV() {
        return giaDV;
    }

    public void setGiaDV(int giaDV) {
        this.giaDV = giaDV;
    }

    public int getIdDV() {
        return idDV;
    }

    public void setIdDV(int idDV) {
        this.idDV = idDV;
    }

    public cardSanPhamHome(String loaiDV, String tenDV, int giaDV, int idDV, boolean trangThai) {
        this.loaiDV = loaiDV;
        this.tenDV = tenDV;
        this.giaDV = giaDV;
        this.idDV = idDV;
        this.trangThai = trangThai;
    }
    public cardSanPhamHome(){
        
    }
}

