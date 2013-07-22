package com.tw.leiyu;

public class UnitFactory {
    public static Unit createUnit(String unit){
        if(unit.equalsIgnoreCase("mile"))
            return new Mile();
        else if(unit.equalsIgnoreCase("yard"))
            return new Yard();
        else if(unit.equalsIgnoreCase("foot"))
            return new Foot();
        else if(unit.equalsIgnoreCase("inch"))
            return new Inch();
        else
            return null;

    }
}
