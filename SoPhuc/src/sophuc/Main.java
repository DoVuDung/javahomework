/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sophuc;

/**
 *
 * @author Andy
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Nhap So phuc thu nhat: ");
        SoPhuc soPhuc1 = new SoPhuc();
        soPhuc1 = soPhuc1.nhapSoPhuc();

        System.out.println("Nhap So phuc thu hai: ");
        SoPhuc soPhuc2 = new SoPhuc();
        soPhuc2 = soPhuc2.nhapSoPhuc();
        
        System.out.println("Hien thi So phuc thu nhat: ");
        soPhuc1.hienThi(soPhuc1);
        System.out.println("Hien thi So phuc thu hai: ");
        soPhuc2.hienThi(soPhuc2);
        
        System.out.println("Tong 2 so phuc :");
        SoPhuc Tong2SoPhuc = new SoPhuc();
        Tong2SoPhuc = Tong2SoPhuc.tong2SoPhuc(soPhuc1, soPhuc2);
        Tong2SoPhuc.hienThi(Tong2SoPhuc);
        
        System.out.println("Hieu 2 so phuc :");
        SoPhuc Hieu2SoPhuc = new SoPhuc();
        Hieu2SoPhuc = Hieu2SoPhuc.hieu2SoPhuc(soPhuc1, soPhuc2);
        Hieu2SoPhuc.hienThi(Hieu2SoPhuc);
        
        System.out.println("Tich 2 so phuc :");
        SoPhuc Tich2SoPhuc = new SoPhuc();
        Tich2SoPhuc = Tich2SoPhuc.tich2SoPhuc(soPhuc1, soPhuc2);
        Tich2SoPhuc.hienThi(Tich2SoPhuc);
        
        System.out.println("Thuong 2 so phuc :");
        SoPhuc Thuong2SoPhuc = new SoPhuc();
        Thuong2SoPhuc = Thuong2SoPhuc.thuong2SoPhuc(soPhuc1, soPhuc2);
        Thuong2SoPhuc.hienThi(Thuong2SoPhuc);
        
        
    }
}
