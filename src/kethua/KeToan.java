package kethua;

public class KeToan extends NhanVien {
    private String bangCap;
    private String maTruongPhong;

    public KeToan(String maNhanVien, String tenNhanVien) {
        super(maNhanVien, tenNhanVien);
    }

    public KeToan(String maNhanVien, String tenNhanVien, String ngaySinh, boolean gioiTinh, double luong,
                  String bangCap, String maTruongPhong) {
        super(maNhanVien, tenNhanVien, ngaySinh, gioiTinh, luong);
        this.bangCap = bangCap;
        this.maTruongPhong = maTruongPhong;
    }

    public String getBangCap() {
        return bangCap;
    }

    public void setBangCap(String bangCap) {
        this.bangCap = bangCap;
    }

    public String getMaTruongPhong() {
        return maTruongPhong;
    }

    public void setMaTruongPhong(String maTruongPhong) {
        this.maTruongPhong = maTruongPhong;
    }
}

