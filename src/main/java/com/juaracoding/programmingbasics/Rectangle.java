package com.juaracoding.programmingbasics;
/*
Created by Intellij IDEA 2022.2.3 (Ultimate Edition)
Build #IU-222.4345.14, BUILT ON oCTOBER 5,2022
@author $(USER) a.k.a Serly Armeliana Delvi
Java Developer
Created on 08/12/2022 06:27
last Modified on 08/12/2022 06:27
Version 1.0
*/

public class Rectangle {
    // define teo fields
    private double length;
    private double width;

    //define no arg constructor
    Rectangle()
    {
     this.length = 1;
     this.width = 1;
    }

        //define parameterized constructor
        Rectangle(double length, double width)
        {
         this.length = length;
         this.width = width;
        }
        void setSize(double l,double w)
        {
         length = l;
         width = w;
        }
        //define a method to return area
        double getSize()
        {
            return (length*width);
        }

        //define a method to return perimeter
        double getPerimeter()
        {
         return(2*(length + width));
        }




}
