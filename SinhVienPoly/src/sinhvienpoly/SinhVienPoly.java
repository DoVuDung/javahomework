/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhvienpoly;

/**
 *
 * @author Andy
 */
public abstract class SinhVienPoly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SVPoly in = new SVPoly();
        System.out.println(in);
        in.nhap();
        Menu menu = new Menu();
        System.out.print(menu);
    }

    

}
