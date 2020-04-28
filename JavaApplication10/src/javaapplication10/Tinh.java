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
public class Tinh {

    private int a, b;
    static char pt;

    public Tinh() {
    }

    public Tinh(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int cong() {
        int cong;
        return cong = a + b;
    }

    public int tru() {
        int tru;
        return tru = a - b;
    }

    public int nhan() {
        int nhan;
        return nhan = a * b;
    }

    public float chia() {
        float chia;
        return chia = (float) a / b;
    }

    public void nhap() {
        do {
            Scanner pheptinh = new Scanner(System.in);
            System.out.println("Nhap phep tinh (+,-,*,/)");
            pt = pheptinh.next().charAt(0);
        } while (pt != '+' && pt != '-' && pt != '*' && pt != '/');
    }

    public void xuLi() {
        switch (pt) {
            case '+':
                System.out.println("a + b = " + cong());
                break;
            case '-':
                System.out.println("a - b = " + tru());
                break;
            case '*':
                System.out.println("a * b = " + nhan());
                break;
            case '/':
                System.out.println("a / b = " + chia());
                break;
            default:
                System.out.println("khong phai phep toan");
        }
    }

}
