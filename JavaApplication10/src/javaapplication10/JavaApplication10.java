/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Tinh 2 so nguyen");
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap x = ");
        int x = nhap.nextInt();
        System.out.println("nhap y =  ");
        int y = nhap.nextInt();
        
        Tinh tinh = new Tinh(x, y);
        tinh.nhap();
        tinh.xuLi();
    }
    
}
