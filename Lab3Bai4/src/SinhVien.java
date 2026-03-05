public class SinhVien {
    private String hoTen;
    private double diem;

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public SinhVien() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public String getHocLuc(){
        if(diem >= 9)
            return "Xuất sắc";
        else if(diem > 7)
            return "Giỏi";
        else if (diem > 6)
            return "Khá";
        else if (diem > 5)
            return "Trung bình";
        return "Yếu";
    }

    @Override
    public String toString() {
        return "họ tên: " + hoTen + ", điểm: " + diem + ", học lực: " + getHocLuc();
    }
}
