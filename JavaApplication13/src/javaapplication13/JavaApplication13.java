/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b;
        System.out.println("Giai Phuong Trinh ax +b = 0");
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap a = ");
        a = kb.nextInt();
        System.out.println("Nhap b = ");
        b = kb.nextInt();
        if (b >= 0) {
            System.out.println("Phuong trinh co dang : " + a + "x + " + b + " = 0");
        } else {

            System.out.println("Phuong trinh co dang : " + a + "x " + b + " = 0");
        }
        giai pt = new giai(a, b);
        pt.tinh(a, b);
    }
// 3=0
}
