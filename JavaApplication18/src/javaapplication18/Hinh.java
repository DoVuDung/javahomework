/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;
import java.util.Scanner;
/**
 *
 * @author Andy
 */
public class Hinh {
    private Hinh a[];
    public void nhap() {
        int n;
        Scanner kb = new Scanner(System.in);
        System.out.println("nhap sp hinh >0");
        n = kb.nextInt();
        a = new Hinh[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap loai hinh" + (i + 1) + "(1: Tron,2: Vuong,3: TamGiac):");
            int chon;
            chon = kb.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("nhap ban kinh");
                    float h1;
                    h1 = kb.nextFloat();
                    a[i] = new Tron(h1);
                    break;
                case 2:
                    System.out.println("nhap canh");
                    float h2;
                    h2 = kb.nextFloat();
                    a[i] = new Vuong(h2);
                    break;
                default:
                    System.out.println("nhap chieu cao va canh day");
                    float h3,h4;
                    h3 = kb.nextFloat();     
                    h4 = kb.nextFloat();
                    a[i] = new TamGiac(h3, h4);
                    break;
            }

        }
 
    }
    public void xuat(){
        for(int i = 0; i<a.length; i++)
            System.out.println(a[i]);
    }
    public void demHinh(){
        int demTron = 0, demVuong = 0, demTamGiac = 0;
        for(int i = 0;i<a.length;i++){
            if
        }
            
    }

}
