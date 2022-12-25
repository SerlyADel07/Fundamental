package com.juaracoding.string;
/*
Created by Intellij IDEA 2022.2.3 (Ultimate Edition)
Build #IU-222.4345.14, BUILT ON oCTOBER 5,2022
@author $(USER) a.k.a Serly Armeliana Delvi
Java Developer
Created on 25/12/2022 20:28
last Modified on 25/12/2022 20:28
Version 1.0
*/

import java.util.Scanner;

public class UserInput {
 public static void main(String[] args) {
  int panjang, lebar;
  Scanner sn = new Scanner(System.in);

  System.out.println("Panjangnya: ");
  panjang = sn.nextInt();
  System.out.println("Lebarnya: ");
  lebar = sn.nextInt();

  System.out.println("Panjangnya: "+ panjang);
  System.out.println("Lebarnya: "+ lebar);

 }
}
