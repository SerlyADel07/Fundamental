package com.juaracoding.string;
/*
Created by Intellij IDEA 2022.2.3 (Ultimate Edition)
Build #IU-222.4345.14, BUILT ON oCTOBER 5,2022
@author $(USER) a.k.a Serly Armeliana Delvi
Java Developer
Created on 23/12/2022 15:40
last Modified on 23/12/2022 15:40
Version 1.0
*/

public class PenggabunganString {
     public static void main(String[] args) {
//         String strFirst = "abcde";
//         String strSecond = "abcfg";
//         System.out.println(strFirst.concat(strSecond));
//
//         String strThird = strFirst + strSecond +"xyz";
//         System.out.println(strThird);

         String a = " ";
         StringBuilder sBuild = new StringBuilder();
         for (int i=0; i<1000; i++)
         {
             for (int j=0; j<1000; j++)
             {
                 sBuild.setLength(0);
                 System.out.println(sBuild.append(j).append("\ti - ke\t: ").append(i).toString());
                 sBuild.setLength(0);
                 a=sBuild.append(a).append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa").toString();

             }
         } try {
             Thread.sleep(10000);
         } catch (InterruptedException e){
             e.printStackTrace();
         }
         System.out.println(a);
         System.out.println("DONE");

 }
}
