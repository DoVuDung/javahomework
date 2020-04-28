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
public class main {

    public static void main(String[] args) {
        int r, h ;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap r");
        r = input.nextInt();
        System.out.println("Nhap h");
        h = input.nextInt();
        HinhTru ht = new HinhTru(h, r);
        System.out.print(ht.tinhV());
        System.out.println(ht.tinhS_XQ());
        System.out.println(ht.tinhS_TP());
    }

}
