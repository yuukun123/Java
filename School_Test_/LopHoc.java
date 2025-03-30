package School_Test_;

import java.util.ArrayList;
import java.util.List;

class LopHoc {
    String maSoLop;
    List<SinhVien> danhSachSinhVien;

    public LopHoc(String maSoLop) {
        this.maSoLop = maSoLop;
        this.danhSachSinhVien = new ArrayList<>();
    }

    public void themSinhVien(SinhVien sinhVien) {
        this.danhSachSinhVien.add(sinhVien);
    }

    @Override
    public String toString() {
        return "LopHoc{" +
                "maSoLop='" + maSoLop + '\'' +
                ", danhSachSinhVien=" + danhSachSinhVien +
                '}';
    }
}