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
public class Vuong {
    private int canh;

    public Vuong() {
    }

    public Vuong(int canh) {
        this.canh = canh;
    }

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }

    @Override
    public String toString() {
        return "Vuong{" + "canh=" + canh + '}';
    }
    
}
