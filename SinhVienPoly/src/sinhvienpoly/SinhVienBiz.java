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
public class SinhVienBiz extends SVPoly{
    protected double diem_marketing, diem_sales;

    public SinhVienBiz() {
    }

    public SinhVienBiz(double diem_marketing, double diem_sales) {
        this.diem_marketing = diem_marketing;
        this.diem_sales = diem_sales;
    }

    public SinhVienBiz(double diem_marketing, double diem_sales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diem_marketing = diem_marketing;
        this.diem_sales = diem_sales;
    }

    public double getDiem_marketing() {
        return diem_marketing;
    }

    public void setDiem_marketing(double diem_marketing) {
        this.diem_marketing = diem_marketing;
    }

    public double getDiem_sales() {
        return diem_sales;
    }

    public void setDiem_sales(double diem_sales) {
        this.diem_sales = diem_sales;
    }
    public double getDiem(){
        return ((2*diem_marketing+diem_sales)/3);
    }
    
}
