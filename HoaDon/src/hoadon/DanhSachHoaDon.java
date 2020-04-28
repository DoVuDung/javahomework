/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoadon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class DanhSachHoaDon extends HoaDon implements IHoaDon {

    ArrayList<String> danhSachs = new ArrayList<>();
    HoaDon hoadon = new HoaDon();
    HoaDonTheoNgay ngay = new HoaDonTheoNgay();
    HoaDonTheoGio gio = new HoaDonTheoGio();

    public DanhSachHoaDon() {
    }

    public ArrayList<String> getDanhSachs() {
        return danhSachs;
    }

    public void setDanhSachs(ArrayList<String> danhSachs) {
        this.danhSachs = danhSachs;
    }

    public boolean themVaoDanhSach() {
        int soluong;
        System.out.print("Số lượng cần thêm");
        Scanner them = new Scanner(System.in);
        soluong = them.nextInt();
        for (int i = 0; i <= soluong; i++) {
            hoadon.tinhThanhTien();
        }
        return true;

    }

    public void layDanhSachHoaDon() {
       
    }

    public boolean xoaTheoMaHoaDon(String maHD) {
        System.out.println("nhập mã hóa đơn");
        Scanner hoadon = new Scanner(System.in);
        maHD = hoadon.nextLine();
        danhSachs.add(maHD);
        Iterator<String> iterator = danhSachs.iterator();
        return true;

    }

    public void timHoaDon(String maHD) {
        System.out.println("nhập mã hóa đơn");
        Scanner hoadon = new Scanner(System.in);
        maHD = hoadon.nextLine();
        danhSachs.add(maHD);
        Iterator<String> iterator = danhSachs.iterator();
        System.out.println("Hóa đơn cần tìm là: ");
        while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        }

    }

    public double tinhTongTienHoaDon() {
          
        return 0;

    }
}
