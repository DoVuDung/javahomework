/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Andy
 */
public class HinhTron {

    private double r;

    public HinhTron() {

    }

    public HinhTron(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double tinhS() {
        return Math.PI * r * r;
    }

    public double tinhP() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return "HinhTron" + "r=" + r +",p=" + (int)Math.round(tinhP()) + ",s=" + (int)Math.round(tinhS()) ;
    }

    
    

    // alt + shift + f : format code
    // crtl + shift : copy add sentence
    // ctrl + enter : recommend system
    //
    
}
