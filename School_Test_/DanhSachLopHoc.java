package School_Test_;

import java.util.ArrayList;
import java.util.List;

class DanhSachLopHoc {
    List<LopHoc> danhSach;

    public DanhSachLopHoc() {
        this.danhSach = new ArrayList<>();
    }

    public void themLopHoc(LopHoc lopHoc) {
        this.danhSach.add(lopHoc);
    }

    public void hienThiDanhSachLopHoc() {
        for (LopHoc lopHoc : danhSach) {
            System.out.println(lopHoc);
        }
    }
}