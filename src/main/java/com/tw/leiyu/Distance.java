package com.tw.leiyu;

public class Distance {
    private final Unit unit;
    private final int length;

    public Distance(int length, String unit) {
        this.length = length;
        this.unit = UnitFactory.createUnit(unit);
    }

    public Unit getUnit() {
        return unit;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean equals(Object o) {
        Distance distance = (Distance)o;
        return distance.getUnit().convertToInch()*distance.getLength() == length*unit.convertToInch();
    }
}
