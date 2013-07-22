package com.tw.leiyu;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class DistanceTest {

    private Distance oneMile;
    private Distance oneYard;
    private Distance oneFoot;
    private Distance oneInch;

    @Before
    public void setUp() throws Exception {
        oneMile = new Distance(1,"mile");
        oneYard = new Distance(1,"yard");
        oneFoot = new Distance(1,"foot");
        oneInch = new Distance(1,"inch");
    }

    @Test
    public void should_return_true_if_1_mile_compares_with_1_mile() throws Exception {
        Distance anotherOneMile = new Distance(1,"mile");
        assertThat(oneMile,is(anotherOneMile));
    }

    @Test
    public void should_return_false_if_1_mile_compares_with_2_miles() throws Exception {
        Distance twoMile = new Distance(2,"mile");
        assertThat(oneMile,is(not(twoMile)));
    }

    @Test
    public void should_return_true_if_1_yard_compares_with_1_yard() throws Exception {
        Distance anotherOneYard = new Distance(1,"yard");
        assertThat(oneYard,is(anotherOneYard));
    }

    @Test
    public void should_return_false_if_1_yard_compares_with_2_yards() throws Exception {
        Distance twoYard = new Distance(2,"yard");
        assertThat(oneYard,is(not(twoYard)));
    }

    @Test
    public void should_return_true_if_1_mile_compares_with_1760_yard() throws Exception {
        Distance yard1760 = new Distance(1760,"yard");
        assertThat(oneMile,is(yard1760));
    }

    @Test
    public void should_return_false_if_1_mile_compares_with_1761_yard() throws Exception {
        Distance yard1761 = new Distance(1761,"yard");
        assertThat(oneMile,is(not(yard1761)));
    }

    @Test
    public void should_return_true_if_1_foot_compares_with_1_foot() throws Exception {
        Distance anotherOneFoot = new Distance(1,"foot");
        assertThat(oneFoot,is(anotherOneFoot));
    }

    @Test
    public void should_return_false_if_1_foot_compares_with_2_foot() throws Exception {
        Distance twoFoot = new Distance(2,"foot");
        assertThat(oneFoot,is(not(twoFoot)));
    }

    @Test
    public void should_return_true_if_1_yard_compares_with_3_foot() throws Exception {
        Distance threeFoot = new Distance(3,"foot");
        assertThat(oneYard,is(threeFoot));
    }

    @Test
    public void should_return_false_if_1_yard_compares_with_4_foot() throws Exception {
        Distance fourFoot = new Distance(4,"foot");
        assertThat(oneYard,is(not(fourFoot)));
    }

    @Test
    public void should_return_true_if_1_inch_compares_with_1_inch() throws Exception {
        Distance anotherOneInch = new Distance(1,"inch");
        assertThat(oneInch,is(anotherOneInch));
    }

    @Test
    public void should_return_false_if_1_inch_compares_with_2_inch() throws Exception {
        Distance twoInch = new Distance(2,"inch");
        assertThat(oneInch,is(not(twoInch)));
    }

    @Test
    public void should_return_true_if_1_foot_compares_with_12_inch() throws Exception {
        Distance inch12 = new Distance(12,"inch");
        assertThat(oneFoot,is(inch12));
    }

    @Test
    public void should_return_false_if_1_foot_compares_with_13_inch() throws Exception {
        Distance inch13 = new Distance(13,"inch");
        assertThat(oneFoot,is(not(inch13)));

    }
}
