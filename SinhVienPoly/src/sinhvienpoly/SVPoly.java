/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhvienpoly;

import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class SVPoly {

    private String hoTen, nganh;

    public SVPoly() {
    }

    public SVPoly(final String hoTen, final String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(final String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(final String nganh) {
        this.nganh = nganh;
    }

    public void nhap() {
        int soluong_SV;
        System.out.print("Số lương sinh viên cần nhập vào danh sách ");
        final Scanner in = new Scanner(System.in);
        soluong_SV = in.nextInt();

        for (int i = 1; i >= soluong_SV; i++) {
            System.out.println("Nhập Họ Tên lần" + i);
            hoTen = in.next(hoTen);
            System.out.println("Nhập ngành");
            nganh = in.next(nganh);

        }
    }

    public void xuat() {
        nhap();
        getHocLuc();
        GetDiem diem;
        diem = new GetDiem() {
            @Override
            public double diem() {
                throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods,
                                                                               // choose Tools | Templates.
            };
        }

        ;
    }

    public void getHocLuc() {
        final GetDiem diem = new GetDiem() {
            @Override
            public double diem() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        switch (diem) {
            case 1 :
                if(5 < diem);
                System.out.println("Yếu");
                break;
            case 2: 
                if((5 <= diem) && (6 > diem));
                System.out.println("Trung Bình");
                break;
            case 3  :
                if((7.5 < diem) && (6.5 <= diem))
                System.out.println("Khá");
                break;
            case 4: 
                if((7.5 <= diem) && (9 > diem));
                System.out.println("Giỏi");
                break;
            case 5 :
                if(diem>9);
                System.out.println("Xuất Sắc");
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
