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
public class HopChuNhat extends CN {

    protected double chieucao;

    public HopChuNhat() {
    }

    public HopChuNhat(double chieucao, double chieudai, int canh) {
        super(chieudai, canh);
        this.chieucao = chieucao;
    }

    public double getChieucao() {
        return chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    @Override
    public String toString() {
        return "HopChuNhat{" + "chieucao=" + chieucao + '}';
    }
    
}
