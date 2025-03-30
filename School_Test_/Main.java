package School_Test_;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách sinh viên
        DanhSachSinhVien danhSachSinhVienKhoa = new DanhSachSinhVien();

        // Tạo 5 sinh viên
        SinhVien sv1 = new SinhVien("SV001", "Nguyễn Văn A", "14/01/2004", "CNTT", 3.5);
        SinhVien sv2 = new SinhVien("SV002", "Trần Thị B", "14/01/2004", "Kinh tế", 3.2);
        SinhVien sv3 = new SinhVien("SV003", "Lê Văn C", "14/01/2004", "CNTT", 3.8);
        SinhVien sv4 = new SinhVien("SV004", "Phạm Thị D", "14/01/2004", "Kinh tế", 3.0);
        SinhVien sv5 = new SinhVien("SV005", "Hoàng Văn E", "14/01/2004", "CNTT", 3.6);

        // Thêm sinh viên vào danh sách
        danhSachSinhVienKhoa.themSinhVien(sv1);
        danhSachSinhVienKhoa.themSinhVien(sv2);
        danhSachSinhVienKhoa.themSinhVien(sv3);
        danhSachSinhVienKhoa.themSinhVien(sv4);
        danhSachSinhVienKhoa.themSinhVien(sv5);

        // Hiển thị danh sách sinh viên
        System.out.println("Danh sách sinh viên của khoa:");
        danhSachSinhVienKhoa.hienThiDanhSachSinhVien();

        // Tạo danh sách lớp học
        DanhSachLopHoc danhSachLopHoc = new DanhSachLopHoc();

        // Tạo 2 lớp học
        LopHoc lop1 = new LopHoc("LH001");
        LopHoc lop2 = new LopHoc("LH002");

        // Thêm sinh viên vào lớp học
        lop1.themSinhVien(sv1);
        lop1.themSinhVien(sv3);
        lop2.themSinhVien(sv2);
        lop2.themSinhVien(sv4);

        // Thêm lớp học vào danh sách
        danhSachLopHoc.themLopHoc(lop1);
        danhSachLopHoc.themLopHoc(lop2);

        // Hiển thị danh sách lớp học
        System.out.println("\nDanh sách lớp học:");
        danhSachLopHoc.hienThiDanhSachLopHoc();

        // Tìm kiếm sinh viên
        SinhVien sinhVienTimKiem = danhSachSinhVienKhoa.timKiemSinhVien("Trần Thị B");
        if (sinhVienTimKiem != null) {
            System.out.println("\nSinh viên tìm kiếm: " + sinhVienTimKiem);

            // Cập nhật điểm trung bình tích lũy
            CapNhatDiem capNhatDiem = new CapNhatDiemImpl();
            capNhatDiem.capNhatDiemTrungBinhTichLuy(sinhVienTimKiem, 3.5);

            System.out.println("\nSinh viên sau khi cập nhật điểm:");
            System.out.println(sinhVienTimKiem);
        } else {
            System.out.println("\nKhông tìm thấy sinh viên.");
        }
    }
}
