package com.abstraction;

public class AbstractImpl1  extends  Abstract4 {
    @Override
    public String Sun() {
        String solareclipse ="LeapYear";
        return solareclipse;
    }

    @Override
    public String Moon() {
        String lunareclipse = "LeapYear1";
        return lunareclipse;
    }

    public static void main(String[] args) {
        AbstractImpl1 ai = new AbstractImpl1();
       String universe= ai.Sun();
        System.out.println(universe);
     String universe1= ai.Moon();
        System.out.println(universe1);
    }
}
