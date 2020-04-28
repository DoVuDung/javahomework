package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        double x;
        Scanner kb = new Scanner(System.in);
        System.out.println("nhap x = ");
        x = kb.nextDouble();
        HinhTron a = new HinhTron(x);
        System.out.println(a); // a la doi tuog
    }
}
