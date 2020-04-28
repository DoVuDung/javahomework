/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sophuc;

import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class SoPhuc {

//  Khai báo phần thực , phần ảo
    private int pT, pA;

    public SoPhuc() {
    }

    public SoPhuc(int pT, int pA) {
        this.pT = pT;
        this.pA = pA;
    }

    public int getpT() {
        return pT;
    }

    public void setpT(int pT) {
        this.pT = pT;
    }

    public int getpA() {
        return pA;
    }

    public void setpA(int pA) {
        this.pA = pA;
    }
    
//    Phương thức nhập phần thực phần ảo và khởi tạo 1 số phức mới
    public SoPhuc nhapSoPhuc(){ 
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap phần thực: ");
        int a = nhap.nextInt();
        System.out.println("Nhap phần ảo: ");
        int b = nhap.nextInt();
        // ????
        SoPhuc soPhuc = new SoPhuc(a, b);
        return soPhuc;
    }
    
    public void hienThi(SoPhuc soPhuc){
        System.out.println(soPhuc.pT + " + " + soPhuc.pA + "i");
    }
    
    public SoPhuc tong2SoPhuc(SoPhuc soPhuc1, SoPhuc soPhuc2){
        SoPhuc Tong = new SoPhuc();
        Tong.pT = soPhuc1.pT + soPhuc2.pT;
        Tong.pA = soPhuc1.pA + soPhuc2.pA;
        return Tong;
    }
    
    public SoPhuc hieu2SoPhuc(SoPhuc soPhuc1, SoPhuc soPhuc2){
        SoPhuc Hieu = new SoPhuc();
        Hieu.pT = soPhuc1.pT - soPhuc2.pT;
        Hieu.pA = soPhuc1.pA - soPhuc2.pA;
        return Hieu;
    }
    
    public SoPhuc tich2SoPhuc(SoPhuc soPhuc1, SoPhuc soPhuc2){
        SoPhuc Tich = new SoPhuc();
        Tich.pT = soPhuc1.pT*soPhuc2.pT -soPhuc1.pA*soPhuc2.pA;
        Tich.pA = soPhuc1.pT*soPhuc2.pA + soPhuc1.pA*soPhuc2.pT;
        return Tich;
    }
    public SoPhuc thuong2SoPhuc(SoPhuc soPhuc1, SoPhuc soPhuc2){
        SoPhuc Thuong = new SoPhuc();
        Thuong.pT = (int) ((soPhuc1.pT*soPhuc2.pT + soPhuc1.pA*soPhuc2.pA)/(Math.pow(soPhuc2.pT,2) + Math.pow(soPhuc2.pA,2)));
        Thuong.pA = (int) ((soPhuc1.pT*soPhuc2.pT - soPhuc1.pA*soPhuc2.pA)/(Math.pow(soPhuc2.pT,2) + Math.pow(soPhuc2.pA,2)));
        return Thuong;
    }
}
