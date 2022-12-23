package com.juaracoding.programmingbasics;
/*
Created by Intellij IDEA 2022.2.3 (Ultimate Edition)
Build #IU-222.4345.14, BUILT ON oCTOBER 5,2022
@author $(USER) a.k.a Serly Armeliana Delvi
Java Developer
Created on 08/12/2022 06:13
last Modified on 08/12/2022 06:13
Version 1.0
*/

public class ExplicitCasting {
    public static void main(String[] args) {
//      (Formula Long ke byte -(128-(a%128))
        short s =  -124;
        char c = 124; // OK, no compile time error
        char d = (char) -124; // NOT OK, compile time error since char cannot hold -ve values
        char e = 's'; // NOT OK, compile time error since a short might have -ve values which char won't be able to hold
        char f = (char)s; // OK, type casting. The negative number  Pertama24 gets converted to 65412 so that char can hold it
        System.out.println((short)f); //  Pertama24, gets converted back to a number short can hold because short won't be able to hold 65412
        System.out.println((int)f); // 65412, gets converted to 65412 because int can easily hold it.

        System.out.println();
    }
}
