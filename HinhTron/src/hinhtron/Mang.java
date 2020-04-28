/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhtron;

import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class Mang {
    private  HinhTron a[];
    public void nhap(){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so >0");
        n = in.nextInt();
        a = new HinhTron(n);
        for(int i=0;i<n;i++){
            System.out.println("Nhap "+(i+1)+"(Hinh Tron: Hinh Tru):");
            int chon;
            chon = in.nextInt();
            if(chon == 1){
                System.out.println("Nhap r,h");
                int h1,h2;
                h1 = in.nextInt();
                h2 = in.nextInt();
                a[i] = new HinhTru(h1,h2);
            }
            else{
                System.out.println("Nhap r");
                int h1;
                h1 = in.nextInt();
                a[i] = new HinhTron(h1); 
            }
        }
    }
    public void xuat(){
        for(int i = 0;i < a.length; i++){
            if(a[i] instanceof HinhTru) demHinhTru ++;
            else demHinhTru++
        }
           
    }
    
    
    
}
