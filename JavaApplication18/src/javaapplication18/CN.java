/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author Andy
 */
public class CN extends Vuong {

    protected double chieudai;

    public CN() {
    }

    public CN(double chieudai, int canh) {
        super(canh);
        this.chieudai = chieudai;
    }

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    @Override
    public String toString() {
        return "CN{" + "chieudai=" + chieudai + '}';
    }
    
}
