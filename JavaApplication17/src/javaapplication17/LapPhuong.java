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
public class LapPhuong extends Vuong{
    private int chieudai, chieucao;

    public LapPhuong() {
    }
    public LapPhuong(int chieudai, int chieucao, int a) {
        super(a);
        this.chieudai = chieudai;
        this.chieucao = chieucao;
    }

    public int getChieudai() {
        return chieudai;
    }

    public void setChieudai(int chieudai) {
        this.chieudai = chieudai;
    }

    public int getChieucao() {
        return chieucao;
    }

    public void setChieucao(int chieucao) {
        this.chieucao = chieucao;
    }
    public int TinhV(){
        return a*chieudai*chieucao;
    }
    public int tinh
    @Override
    public String toString() {
        return "LapPhuong{" + "chieudai=" + chieudai + ", chieucao=" + chieucao + '}';
    }
    
    
}
