package all_defs_coverage;

import openjdk.StringTokenizer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SandiferAV on 4/6/2016.
 */
public class All_Defs_Test {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testHasMoreTokens() throws Exception {

    }

    @Test
    public void testNextToken() throws Exception {

    }

    @Test
    public void testNextToken1() throws Exception {

    }

    @Test
public void testHasMoreElementsTrue() throws Exception {
        StringTokenizer stringTokenizer = new StringTokenizer("Test 1");
        Assert.assertTrue(stringTokenizer.hasMoreElements());

    }

    public void testHasMoreElementsFalse() throws Exception {
        StringTokenizer stringTokenizer = new StringTokenizer("Testing this application");
        stringTokenizer.nextElement();
        stringTokenizer.nextToken();

        Assert.assertFalse(stringTokenizer.hasMoreElements());

    }


    @Test
    public void testNextElement() throws Exception {

    }

    @Test
    public void testCountTokens() throws Exception {

    }
}