package com.juaracoding.string;
/*
IntelliJ IDEA 2022.2.3 (Ultimate Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author ACER a.k.a. Serly Armeliana Delvi
Java Developer
Created on 16/01/2023 12:14
@Last Modified 16/01/2023 12:14
Version 1.0
*/

import java.util.Scanner;

public class PraktikumSatu {
    public static void main(String[] args) {
        String praktikum= " ";
        Scanner sn = new Scanner(System.in);

        System.out.println("Masukkan Kata: ");
        praktikum = sn.nextLine();

        switch (praktikum){
            case "Jquery 1995@v1.0":
                System.out.println("529");
                break;
            case "Bebas Lepas@":
                System.out.println("238");
            case "Tid4k $@ma":
                System.out.println("0");
                break;
        }
    }
}
