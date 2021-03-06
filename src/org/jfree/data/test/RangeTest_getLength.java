package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.Test;

public class RangeTest_getLength {
	static double ERROR_MARGIN = 0.000000001d;
	Range testRange;
    
	@Test
    public void test_getlength_withPositiveValueBounds() {
    	testRange = new Range(1.0, 3.0);
    	double actual = testRange.getLength();
    	double expected = 2.0;
    	assertEquals("Length of Range in Positive Range." ,expected, actual, ERROR_MARGIN);
    }
	
	@Test
    public void test_getlength_withPositiveAndNegativeValueBounds() {
    	testRange = new Range(-3.0, 3.0);
    	double actual = testRange.getLength();
    	double expected = 6.0;
    	assertEquals("Length of range over both positive and negative range." ,expected, actual, ERROR_MARGIN);
    }
	
	@Test
    public void test_getlength_withNegativeValueBounds() {
    	testRange = new Range(-3.0, -1.0);
    	double actual = testRange.getLength();
    	double expected = 2.0;
    	assertEquals("Length of rage with only negative range." ,expected, actual, ERROR_MARGIN);
    }

}
