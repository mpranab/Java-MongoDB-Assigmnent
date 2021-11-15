package junitque2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindMaxMinFinderTest2 {
	
	 int[] array = new int[] {56,34,7,3,54,3,34,34,53};
	
	
	@Test
    public void testMin() {
        int minValue = FindMaxMinFinder2.findMin(array);
        assert(minValue == 3);
    }
	@Test
    public void testMax() {
        int maxValue = FindMaxMinFinder2.findMax(array);
        assert(maxValue == 56);
    }
	
	
}
