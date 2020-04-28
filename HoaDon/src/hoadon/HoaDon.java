package hoadon;

import java.util.Date;
import java.util.Scanner;

public class HoaDon implements IHoaDon {

    private String maHD, tenKhach;
    private Date ngayHD;
    double donGia;

    public HoaDon() {
    }

    public HoaDon(String maHD, String tenKhach, Date ngayHD, double donGia) {
        this.maHD = maHD;
        this.tenKhach = tenKhach;
        this.ngayHD = ngayHD;
        this.donGia = donGia;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }

    public Date getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(Date ngayHD) {
        this.ngayHD = ngayHD;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public double tinhThanhTien() {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập mã hóa đơn");
        maHD = nhap.nextLine();
        //System.in.read();
        System.out.println("Nhập tên khách");
        tenKhach = nhap.nextLine();
        
        return 0;
    }

    public static void main(String[] args) {
        int chon;
        HoaDon hoadon = new HoaDon();
        hoadon.tinhThanhTien();
        HoaDonTheoGio theogio = new HoaDonTheoGio();
        HoaDonTheoNgay theongay = new HoaDonTheoNgay();
        DanhSachHoaDon danhsach = new DanhSachHoaDon();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Chọn\n(1: Hóa đơn theo giờ)\n(2: Hóa đơn theo ngày)\n(3:Thêm vào danh sách)");
        System.out.println("(4:Lấy danh sách hóa đơn)\n(5:Xóa theo mã hóa đơn)\n(6:Tìm theo mã hóa đơn)\n(7:Tính tổng tiền các hóa đơn)");
        chon = sc.nextInt();
        if(chon == 1 ) theogio.tinhThanhTien();
        if(chon == 2 ) theongay.tinhThanhTien();
        if(chon == 3) danhsach.themVaoDanhSach();
        if(chon == 4) danhsach.layDanhSachHoaDon();
        if(chon == 5) danhsach.xoaTheoMaHoaDon("");
        if(chon == 6) danhsach.timHoaDon("");
        if(chon == 7) danhsach.tinhTongTienHoaDon();
        //sai
        //System.out.println(hoadon.xuatHoaDon());

    }
        //sai
        public int xuatHoaDon(){
            System.out.println("Thông tin hóa đơn");
            //tinhThanhTien();
            //System.out.println(tinhThanhTien());
            
            return 0;
        }

}
