package School_Test_;

class CapNhatDiemImpl implements CapNhatDiem {
    public CapNhatDiemImpl() {
    }

    @Override
    public void capNhatDiemTrungBinhTichLuy(SinhVien sinhVien, double diemMoi) {
        sinhVien.diemTrungBinhTichLuy = diemMoi;
    }
}
