package com.abstraction;

public class AbstractImplimentation extends Abstract2{

    @Override
    public String student() {
        String name = "Sreekanth" ;
        return name;
    }

    @Override
    public String school() {
        String schoolname = "sri sai ram";
        return schoolname;
    }

    public static void main(String[] args) {
         AbstractImplimentation ai = new AbstractImplimentation();
       String name = ai.school();
        System.out.println(name);
       String student = ai.student();
        System.out.println(student);

    }
}
