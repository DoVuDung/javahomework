/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Andy
 */
public class DienTich {

    private int x, y;

    public DienTich() {
    }

    public DienTich(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int tinhS(){
        return x*y;
    }

    @Override
    public String toString() {
        return "DienTich{" + "x=" + x + ", y=" + y + '}'+ "s="+tinhS();
    }
    
}
