package com.company;

import java.sql.SQLOutput;

public class WEIGHTonMars {
    public static void main(String[]args){
        //weight on Mars
        float earthweight ;
        float marsWeight;
        double marsWgtInDbl;
        int marsWeightInInt;

        earthweight = 65;
        marsWeight =(earthweight*0.38F);
        System.out.println(earthweight + "kg on Earth is " + "kg on Mars ");

        //float to double
        marsWgtInDbl = marsWeight;
        System.out.println("Kilograms on Mars after conversion to double" + marsWgtInDbl);

        //to decimal places
        System.out.printf("Kilograms on Mars displays to four decimal places : %.4f  %n"  , marsWgtInDbl);

        //a floating point type cast to integer
        marsWeightInInt = (int)marsWgtInDbl;
        System.out.println("Kilograms on Mars when casted to integer " + marsWeightInInt);

        //casting int type to char
        char c = (char)marsWeightInInt ;
        System.out.println("The ASCII table equivalent of marsWeightInInt is: " + c );

        // assigning the value to perform math operations
         int exampleOfMathOnChar = c * c ;
        System.out.println("An example of a mathematical operations on the char type : " + exampleOfMathOnChar);




    }
}
