package com.juaracoding.programmingbasics;
/*
Created by Intellij IDEA 2022.2.3 (Ultimate Edition)
Build #IU-222.4345.14, BUILT ON oCTOBER 5,2022
@author $(USER) a.k.a Serly Armeliana Delvi
Java Developer
Created on 08/12/2022 06:14
last Modified on 08/12/2022 06:14
Version 1.0
*/


public class PassingByReference {
    public static void main(String[] args) {
        Rectangle kotak = new Rectangle(20.0, 30.0);
        System.out.println(kotak);
        System.out.println(kotak.getSize());

        Rectangle duplikatKotak = kotak;
        duplikatKotak.setSize(80.0, 90.0);
        System.out.println(kotak.getSize());
        System.out.println(duplikatKotak.getSize());
    }
}

