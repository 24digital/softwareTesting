package all_uses_coverage;

import openjdk.StringTokenizer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

/**
 * Created by sandiferav on 4/7/2016.
 */
public class All_Uses_Coverage_Test {

    // [1,2,4,5,6,8]
    @Test
    public void testNextToken1() throws Exception {
        StringTokenizer stringTokenizer = new StringTokenizer("Test this string");
        Assert.assertEquals("Test",stringTokenizer.nextToken());
    }

    //[1,2,4,5,6,7]
    @Test(expected=NoSuchElementException.class)
    public void testNextToken4() throws Exception {
        StringTokenizer stringTokenizer = new StringTokenizer("");
        stringTokenizer.nextToken(",");
    }

    /**
     * Testing for more elements to exist after construction.
     * @throws Exception
     */
    @Test
    public void testHasMoreElementsTrue() throws Exception {
        StringTokenizer stringTokenizer = new StringTokenizer("Test 1");
        Assert.assertTrue(stringTokenizer.hasMoreTokens());

    }

    @Test
    public void testCountTokens() throws Exception {

    }
}