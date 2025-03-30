package School_Test_;

class SinhVien {
    String maSoSinhVien;
    String hoTen;
    String ngaySinh;
    String nganh;
    double diemTrungBinhTichLuy;

    public SinhVien(String maSoSinhVien, String hoTen, String ngaySinh, String nganh, double diemTrungBinhTichLuy) {
        this.maSoSinhVien = maSoSinhVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.nganh = nganh;
        this.diemTrungBinhTichLuy = diemTrungBinhTichLuy;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSoSinhVien='" + maSoSinhVien + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", nganh='" + nganh + '\'' +
                ", diemTrungBinhTichLuy=" + diemTrungBinhTichLuy +
                '}';
    }
}

