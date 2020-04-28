/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author Andy
 */
public class HopChuNhat extends Vuong {
    private int  chieucao, chieudai;

    public HopChuNhat() {
    }

    public HopChuNhat(int chieucao, int chieudai, int a) {
        super(a);
        this.chieucao = chieucao;
        this.chieudai = chieudai;
    }

    public int getChieucao() {
        return chieucao;
    }

    public void setChieucao(int chieucao) {
        this.chieucao = chieucao;
    }

    public int getChieudai() {
        return chieudai;
    }

    public void setChieudai(int chieudai) {
        this.chieudai = chieudai;
    }

    @Override
    public String toString() {
        return "HopChuNhat{" + "chieucao=" + chieucao + ", chieudai=" + chieudai + '}';
    }
    
    
    
}
