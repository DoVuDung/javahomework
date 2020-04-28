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
public class LapPhuong extends Vuong {

    protected double chieudai, chieucao;

    public LapPhuong() {
    }

    public LapPhuong(double chieudai, double chieucao, int canh) {
        super(canh);
        this.chieudai = chieudai;
        this.chieucao = chieucao;
    }

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    public double getChieucao() {
        return chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }

    @Override
    public String toString() {
        return "LapPhuong{" + "chieudai=" + chieudai + ", chieucao=" + chieucao + '}';
    }
    
}
