/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.util.Scanner;

/**
 *
 * @author Andy
 */
public class IO {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        // TODO code application logic herec
        final int kieudulieu;
        System.out.println("Xây dựng lớp IO");
        final Scanner input = new Scanner(System.in);
        System.out.println("Kiểu dữ liệu \n1:Boolean\n2:byte\n3:short\n4:int\n5:long\n6:double\n7:float\n8:char");
        System.out.println("Nhập kiểu dữ liệu");
        kieudulieu = input.nextInt();
        do {
            switch (kieudulieu) {
                case 1:
                    System.out.println("Kiểu dữ liệu Boolean");
                    boolean kieu_bloolean;
                    kieu_bloolean = input.hasNextBoolean();
                    break;
                case 2:
                    System.out.println("Kiểu dữ liệu byte");
                    byte kieu_byte;
                    kieu_byte = input.nextByte();
                    break;
                case 3:
                    System.out.println("Kiểu dữ liệu short");
                    short kieu_short;
                    kieu_short = input.nextShort();
                    break;
                case 4:
                    System.out.println("Kiểu dữ liệu int");
                    int kieu_int;
                    kieu_int = input.nextInt();
                    break;
                case 5:
                    System.out.println("Kiểu dữ liệu long");
                    long kieu_long;
                    kieu_long = input.nextLong();
                    break;
                case 6:
                    System.out.println("Kiểu dữ liệu double");
                    double kieu_double;
                    kieu_double = input.nextShort();
                    break;
                case 7:
                    System.out.println("Kiểu dữ liệu float");
                    float kieu_float;
                    kieu_float = input.nextFloat();
                    break;
                case 8:
                    System.out.println("Kiểu dữ liệu char");
                    char kieu_char;
                    kieu_char = input.next().charAt(0);
                    break;

                default:
                    throw new AssertionError();
            }

        } while (kieudulieu > 9 && 0 > kieudulieu);
    }

}
