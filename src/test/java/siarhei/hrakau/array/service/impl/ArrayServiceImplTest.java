package siarhei.hrakau.array.service.impl;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import siarhei.hrakau.array.entity.Array;

import static org.testng.Assert.*;

public class ArrayServiceImplTest {
    private Array testAr= new Array(new int[]{1, -2, -7, 11, 25});
    private ArrayServiceImpl arrayService = new ArrayServiceImpl();

    @Test
    public void testFindMax() {
        int expected = 25;
        int actual = arrayService.findMax(testAr);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFindMin() {
    }

    @Test
    public void testReplaceElements() {
    }

    @Test
    public void testFindAverage() {
    }

    @Test
    public void testFindSum() {
    }

    @Test
    public void testCountNumberOfPositive() {
    }

    @Test
    public void testCountNumberOfNegative() {
    }
}