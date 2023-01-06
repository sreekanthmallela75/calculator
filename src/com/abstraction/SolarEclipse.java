package com.abstraction;

public class SolarEclipse implements Sun,Moon {
    public void abstract3() {

        System.out.println("This is Universe");
    }



    @Override
    public void abstract2() {
        int a =10;
        int b= 20;
        int c= a+b;
        System.out.println(c);
    }

    @Override
    public void abstract1() {
     String name = "Sreekanth";
        System.out.println(name);
    }
    public static void main(String[] args) {
        SolarEclipse se = new SolarEclipse();
        se.abstract3();
        se.abstract1();
        se.abstract2();
    }
}
