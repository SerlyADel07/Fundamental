package com.juaracoding.string;
/*
Created by Intellij IDEA 2022.2.3 (Ultimate Edition)
Build #IU-222.4345.14, BUILT ON oCTOBER 5,2022
@author $(USER) a.k.a Serly Armeliana Delvi
Java Developer
Created on 23/12/2022 19:10
last Modified on 23/12/2022 19:10
Version 1.0
*/

public class MembandingkanString {
    public static void main(String[] args) {
        String namaFirst = "Dono";
        String namaSecond = "Dono"+"";
//        System.out.println(namaFirst==namaSecond);
        System.out.println(namaFirst.equals(namaSecond));

        String strFirst = "Doyok";
        String strSecond = "doyok";
        System.out.println(strFirst.equals(strSecond));
        System.out.println(strFirst.equalsIgnoreCase(strSecond));
    }
}

