package app.Models;

public class Luong {
    private String maluong;
    private String manv;
    private int songaylam;
    private double heso;
    private long phucap;
    private long tongluong;
    private String ghichu;

    public String getmaluong() {
        return maluong;
    }

    public void setmaluong(String maLuong) {
        maluong = maLuong;
    }

    public String getmanv() {
        return manv;
    }

    public void setmanv(String maNV) {
        manv = maNV;
    }

    public int getsongaylam() {
        return songaylam;
    }

    public void setsongaylam(int soNgaylam) {
        songaylam = soNgaylam;
    }

    public long getphucap() {
        return phucap;
    }

    public void setphucap(long phuCap) {
        phucap = phuCap;
    }

    public long gettongluong() {
        return tongluong;
    }

    public void settongluong(long tongLuong) {
        tongluong = tongLuong;
    }

    public String getghichu() {
        return ghichu;
    }

    public void setghichu(String ghiChu) {
        ghichu = ghiChu;
    }

    public double getheso() {
        return heso;
    }

    public void setheso(double HeSo) { // nôn
        heso = HeSo;
    }
}