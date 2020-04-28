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
public  class Menu extends  SinhVienPoly{
 public Menu(){
     int n;
        do {
            System.out.println("Menu(Chon 1 den 5)");
            System.out.println(" 1:Nhap\n 2:Xuat \n 3:SV \n 4:SapXep \n 5:Ketthuc");
            Scanner kb = new Scanner(System.in);
            n = kb.nextInt();
        }while(n<1||n>4);
        System.out.println(n);
      switch(n){
          case 1:
              Nhap();
          case 2:
              Xuat();
          case 3:
              sVGioi();
          case 4:
              sapXep();
          default:ketThuc();
      }
 }
 public void Nhap(){
     System.out.println("Nhap");
     Menu m = new Menu();
 }
 public void Xuat(){
     
 }
 public void sVGioi(){
     
 }
 public void sapXep(){
     
 }

 public void ketThuc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
