package hoangduy.code.monan_adapter;

public class monan {


    public String ten;
    public String gia;
    public int hinh;

    public monan(String ten, String gia, int hinh) {
        this.ten = ten;
        this.gia = gia;
        this.hinh = hinh;
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
