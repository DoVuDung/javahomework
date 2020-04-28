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
public class HinhTru extends HinhTron {

    protected int h;

    public HinhTru() {
    }

    public HinhTru(int h) {
        this.h = h;
    }

    public HinhTru(int h, int r) {
        super(r);
        this.h = h;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public int getR() {
        return r;
    }

    @Override
    public void setR(int r) {
        this.r = r;
    }

    public double tinhV() {
        double Sday = super.tinhS();
        return Sday * h;
    }
    public double tinhS_XQ(){
        double Pday  = super.tinhP();
        return Pday *h;
    }
    public double tinhS_TP(){
        return tinhS_XQ() + 2*tinhS();
    }
    @Override
    public String toString() {
        return "HinhTru{" + "h=" + h + '}';
    }

}
