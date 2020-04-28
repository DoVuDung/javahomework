/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhtron;

/**
 *
 * @author Andy
 */
public class HinhTron {

    protected int r;

    public HinhTron() {
    }

    public HinhTron(int r) {
        this.r = r;
    }

    

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double tinhS() {
        return Math.PI * r * r;
    }
    public  double tinhP(){
        return Math.PI*2*r;
    }
    @Override
    public String toString() {
        return "HinhTron{" + "r=" + r + '}';
    }

}
