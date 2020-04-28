/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;

import java.util.Scanner;

/**
 *
 * @author Andy
 */


    /**
     */
    public class Complex {

        private int thuc, ao;

        public Complex() {
            thuc = 0;
            ao = 0;
        }

        public Complex(final int thuc, final int ao) {
            this.thuc = thuc;
            this.ao = ao;
        }

        public int getThuc() {
            return thuc;
        }

        public void setThuc(final int thuc) {
            this.thuc = thuc;
        }

        public int getAo() {
            return ao;
        }

        public void setAo(final int ao) {
            this.ao = ao;
        }

        @Override
        public String toString() {
            if (ao > 0) {
                return thuc + "+" + ao + "i";
            } else {
                return thuc + ao + "i";
            }
        }

        public Complex cong(Complex b) {
            Complex c = new Complex();
            c.thuc = thuc + b.thuc;
            c.ao = ao + b.ao;
            return c;
        }

        public Complex tru(Complex b) {
            Complex c = new Complex();
            c.thuc = thuc - b.thuc;
            c.ao = ao - b.ao;
            return c;
        }

        public Complex nhan(Complex b) {
            Complex c = new Complex();
            c.thuc = thuc * b.thuc + ao * b.ao;
            c.ao = thuc * b.ao + ao * b.thuc;
            return c;
        }

        public Complex chia(Complex b) {
            Complex c = new Complex();
            c.thuc = (thuc * b.thuc - ao * b.ao) / (int) (Math.pow(b.thuc, 2) - Math.pow(b.ao, 2));
            c.ao = (ao * b.thuc - thuc * b.ao) / (int) (Math.pow(b.thuc, 2) - Math.pow(b.ao, 2));
            return c;
        }

        public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);
            System.out.println("Số thứ nhất: ");
            System.out.print("Nhập thực và ảo: ");
            int x = kb.nextInt();
            int y = kb.nextInt();
            Complex a = new Complex(x, y);
            System.out.println("Số thứ hai: ");
            System.out.print("Nhập thực và ảo: ");
            x = kb.nextInt();
            y = kb.nextInt();
            Complex b = new Complex(x, y);
            System.out.println(a + "+" + b + "=" + a.cong(b));
            System.out.println(a + "-" + b + "=" + a.tru(b));
            System.out.println(a + "*" + b + "=" + a.nhan(b));
            System.out.println(a + "/" + b + "=" + a.chia(b));

        }

    }

    


