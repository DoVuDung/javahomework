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
public class TamGiac {
    private double chieucao, canhday;

    public TamGiac(double chieucao, double canhday) {
        this.chieucao = chieucao;
        this.canhday = canhday;
    }

    public TamGiac() {
    }

    public double getChieucao() {
        return chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }

    public double getCanhday() {
        return canhday;
    }

    public void setCanhday(double canhday) {
        this.canhday = canhday;
    }

    @Override
    public String toString() {
        return "TamGiac{" + "chieucao=" + chieucao + ", canhday=" + canhday + '}';
    }
    
}
