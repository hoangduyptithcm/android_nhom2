package hoangduy.code.bai3_tuan4;

public class cauthu {


    public String ten;
    public String gia;
    public int hinh;
    public int hinh2;

    public cauthu(String ten, String gia, int hinh, int hinh2) {
        this.ten = ten;
        this.gia = gia;
        this.hinh = hinh;
        this.hinh2 = hinh2;
    }

    public int getHinh2() {
        return hinh2;
    }

    public void setHinh2(int hinh2) {
        this.hinh2 = hinh2;
    }

    public String getTen() {
        return ten;
    }

    public String getGia() {
        return gia;
    }

    public int getHinh() {
        return hinh;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

}
