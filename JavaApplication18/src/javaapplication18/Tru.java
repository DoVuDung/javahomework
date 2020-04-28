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
public class Tru extends Tron {

    protected double chieucao;

    public Tru() {
    }

    public Tru(double chieucao, double bankinh) {
        super(bankinh);
        this.chieucao = chieucao;
    }

    public double getChieucao() {
        return chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }

    @Override
    public String toString() {
        return "Tru{" + "chieucao=" + chieucao + '}';
    }
    
}
