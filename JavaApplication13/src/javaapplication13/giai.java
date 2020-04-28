/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author Andb
 */
public class giai {

    private int a, b;

    public giai(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // a=b=0
    public giai() {
    }

    public int getX() {
        return a;
    }

    public void setX(int a) {
        this.a = a;
    }

    public int getY() {
        return b;
    }

    public void setY(int b) {
        this.b = b;
    }

    public void tinh(int a, int b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Pt Vo So ng");
            } else {
                System.out.println("Pt Vo ng");
            }

        } else {
            System.out.println("x="+(-b/a));
        }

    }

    @Override
    public String toString() {
        return a + "a" + b + "=" + "0";
        
    }

}
