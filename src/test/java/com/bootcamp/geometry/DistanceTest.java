package com.bootcamp.geometry;

import org.junit.Assert;
import org.junit.Test;

public class DistanceTest {
    @Test
    public void testCalculateDistanceWith2SameCoordinate() {
        Distance distance = new Distance(0,0,0,0);
        Assert.assertEquals(distance.calculateDistance(), 0;
    }
}
