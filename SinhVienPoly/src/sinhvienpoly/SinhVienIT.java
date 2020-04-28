/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhvienpoly;

/**
 *
 * @author Andy
 */
public class SinhVienIT extends SinhVienPoly {
    protected double diem_java, diem_html, diem_css;

    public SinhVienIT() {
    }

    public SinhVienIT(double diem_java, double diem_html, double diem_css) {
        this.diem_java = diem_java;
        this.diem_html = diem_html;
        this.diem_css = diem_css;
    }

    public SinhVienIT(double diem_java, double diem_html, double diem_css, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diem_java = diem_java;
        this.diem_html = diem_html;
        this.diem_css = diem_css;
    }

    public double getDiem_java() {
        return diem_java;
    }

    public void setDiem_java(double diem_java) {
        this.diem_java = diem_java;
    }

    public double getDiem_html() {
        return diem_html;
    }

    public void setDiem_html(double diem_html) {
        this.diem_html = diem_html;
    }

    public double getDiem_css() {
        return diem_css;
    }

    public void setDiem_css(double diem_css) {
        this.diem_css = diem_css;
    }
    public double getDiem(){
        return ((2*diem_java+diem_html+diem_css)/4);
    }
        
    
}
