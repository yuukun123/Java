package School_Test_;

import java.util.ArrayList;
import java.util.List;

class DanhSachSinhVien {
    List<SinhVien> danhSach;

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<>();
    }

    public void themSinhVien(SinhVien sinhVien) {
        this.danhSach.add(sinhVien);
    }

    public SinhVien timKiemSinhVien(String hoTen) {
        for (SinhVien sinhVien : danhSach) {
            if (sinhVien.hoTen.equals(hoTen)) {
                return sinhVien;
            }
        }
        return null;
    }

    public void hienThiDanhSachSinhVien() {
        for (SinhVien sinhVien : danhSach) {
            System.out.println(sinhVien);
        }
    }
}
