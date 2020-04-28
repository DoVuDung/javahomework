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
public class HoaDonTheoNgay extends HoaDon implements IHoaDon{
    private int soNgayThue;

    public HoaDonTheoNgay() {
    }

    public HoaDonTheoNgay(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public HoaDonTheoNgay(int soNgayThue, String maHD, String tenKhach, Date ngayHD, double donGia) {
        super(maHD, tenKhach, ngayHD, donGia);
        this.soNgayThue = soNgayThue;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }
    @Override
    public double tinhThanhTien(){
        System.out.println("Nhập số ngày thuê");
        Scanner thanhtien = new Scanner(System.in);
        soNgayThue = thanhtien.nextInt();
        System.out.println("Nhập đơn giá");
        donGia = thanhtien.nextInt();
        if(soNgayThue > 7) 
            System.out.println ("Tổng "+((soNgayThue*donGia)-((soNgayThue*donGia*20)/100))) ;      
        else System.out.println( "Tổng "+soNgayThue*donGia);
        return 0;
    }
    
}
