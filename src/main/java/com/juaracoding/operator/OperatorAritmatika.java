package com.juaracoding.operator;
/*
Created by Intellij IDEA 2022.2.3 (Ultimate Edition)
Build #IU-222.4345.14, BUILT ON oCTOBER 5,2022
@author $(USER) a.k.a Serly Armeliana Delvi
Java Developer
Created on 11/12/2022 12:16
last Modified on 11/12/2022 12:16
Version 1.0
*/

import java.util.Scanner;

public class OperatorAritmatika {
    public static void main(String[] args) {
     int angka1;
     int angka2;
     int hasil;

     Scanner keyboard = new Scanner(System.in);

     System.out.print("Input angka Pertama: ");
     angka1 = keyboard.nextInt();
     System.out.print("Input angka Kedua: ");
     angka2 = keyboard.nextInt();

     // Addition / penjumlahan
     hasil = angka1 + angka2;
     System.out.println("Hasil Penjumlahan = " + hasil);

     System.out.print("Input angka Pertama: ");
     angka1 = keyboard.nextInt();
     System.out.print("Input angka Kedua: ");
     angka2 = keyboard.nextInt();

     // Subtraction / pengurangan
     hasil = angka1 - angka2;
     System.out.println("Hasil Pengurangan = " + hasil);

     System.out.print("Input angka Pertama: ");
     angka1 = keyboard.nextInt();
     System.out.print("Input angka Kedua: ");
     angka2 = keyboard.nextInt();

     // Multiplication / perkalian
     hasil = angka1 * angka2;
     System.out.println("Hasil Perkalian = " + hasil);


     System.out.print("Input angka Pertama: ");
     angka1 = keyboard.nextInt();
     System.out.print("Input angka Kedua: ");
     angka2 = keyboard.nextInt();

     // Division / Pembagian
     hasil = angka1 / angka2;
     System.out.println("Hasil Pembagian = " + hasil);

     System.out.print("Input angka Pertama: ");
     angka1 = keyboard.nextInt();
     System.out.print("Input angka Kedua: ");
     angka2 = keyboard.nextInt();

     // Modulus / Sisa Bagi
     hasil = angka1 % angka2;
     System.out.println("Hasil Sisa Bagi = " + hasil);
 }
}
