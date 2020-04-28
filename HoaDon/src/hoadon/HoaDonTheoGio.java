/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoadon;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class HoaDonTheoGio extends HoaDon implements IHoaDon{
    private int soGioThue;

    public HoaDonTheoGio() {
    }

    public HoaDonTheoGio(int soGioThue) {
        this.soGioThue = soGioThue;
    }

    public HoaDonTheoGio(int soGioThue, String maHD, String tenKhach, Date ngayHD, double donGia) {
        super(maHD, tenKhach, ngayHD, donGia);
        this.soGioThue = soGioThue;
    }

    public int getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(int soGioThue) {
        this.soGioThue = soGioThue;
    }
    @Override
    public double tinhThanhTien(){
        System.out.println("Nhập số giờ thuê");
        Scanner thanhtien = new Scanner(System.in);
        soGioThue =thanhtien.nextInt();
        System.out.println("Nhập đơn giá");
        donGia = thanhtien.nextInt();
        System.out.println("Tổng "+donGia*soGioThue);
        return 0;
    }
    
    
    
}
