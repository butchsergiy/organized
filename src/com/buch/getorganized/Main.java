package com.buch.getorganized;

public class Main {

    public static void main(String[] args) {

        System.out.println("The program works..");

        ObjectWithString ob1 = new ObjectWithString();
        System.out.println(ob1.reverceString("ABCD"));

        ObjectWithString ob2 = new ObjectWithString("qwerty");
        ob2.reverceString();
        System.out.println(ob2.getStr());

        System.out.println(ob1.reverceString("eof"));

        System.out.println("The program end.");

    }
}
