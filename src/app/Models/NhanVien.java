package app.Models;

public class NhanVien {
    private String MaNV;
    private String TenNV;
    private String GioiTinh;
    private String NgayVaoLam;
    private String ChucVu;
    private String MaPhong;

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String maNV) {
        MaNV = maNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String tenNV) {
        TenNV = tenNV;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String chucVu) {
        ChucVu = chucVu;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String maPhong) {
        MaPhong = maPhong;
    }
    
    public void setNgayVaoLam(String ngay){
        NgayVaoLam = ngay;
    }
    
    public String getNgayVaoLam(){
        return NgayVaoLam;
    }
}
