package javafile;

import kotlinfile.MyMainKotlinKt;

public class MyMainJava {
    public static void main(String[] args){


        int totalSum = MyMainKotlinKt.returnSumForJavaFile(10,10);
        System.out.println("Total Sum: "+totalSum);

        int sum = MyMainKotlinKt.returnSumForJavaFile(10,20,40);
        System.out.println("Total Sum: "+sum);

    }
}
