/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author Andy
 */
public class SoPhuc {

    private int x, y, z, t;

    public SoPhuc() {
    }

    public SoPhuc(int x, int y, int z, int t) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.t = t;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public int getT() {
        return t;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setT(int t) {
        this.t = t;
    }
    public void tinhTong(){
        (x+y)+(z+t); // không return về cả số và chữ được
    }
//    public int tinhHieu(){
//        return (x-y)+"i"+(z-t);
/*    }
    public int tinhThuong(){
        return 0;
    }
    public int tinhTich(){
        return 0;
    }
    
    @Override
    public String toString() {
        return "SoPhuc{" + "x=" + x + ", y=" + y + ", z=" + z + ", t=" + t + '}';
    }
    
*/
}
