/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Tinh Dien Tich HCN"); 
        int a,b;
        Scanner kb = new Scanner(System.in);
        System.out.println("nhap a = ");
         a = kb.nextInt();
        System.out.println("nhap b = ");
         b = kb.nextInt();
         
         DienTich DT = new DienTich(a, b);
         
         System.out.println(DT);
    }
    
}
