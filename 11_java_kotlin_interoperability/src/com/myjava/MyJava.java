package com.myjava;

import com.mykotlin.MyCustomKotlinFile;

public class MyJava {
    public static void main(String[] args){


        int value = MyCustomKotlinFile.getSum();
        System.out.println("From Java file"+value);

    }

    public  int provideSum(){
        return 10+10;
    }

}
