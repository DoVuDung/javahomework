/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

public class Vuong {
    int a;
    public Vuong() {
    }
    public Vuong(int a) {
        this.a = a;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int TinhP() {
        return a * 4;
    }
    public int TinhS() {
        return a * a;
    }
    @Override
    public String toString() {
        return "S =" + TinhS() + "\nP =" + TinhP();
    }

}
