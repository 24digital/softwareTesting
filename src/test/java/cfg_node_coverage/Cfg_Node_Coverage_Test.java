package cfg_node_coverage;

import openjdk.StringTokenizer;
import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sandiferav on 4/7/2016.
 */
public class Cfg_Node_Coverage_Test {

    @Before
    public void setUp() throws Exception {

    }

    @org.junit.Test
    public void testHasMoreTokens() throws Exception {

    }

    @Test
    public void testNextToken() throws Exception {

    }

    @Test
    public void testNextToken1() throws Exception {

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

    /**
     * Testing for false after removing all elements.
     * @throws Exception
     */
    @Test
    public void testHasMoreElementsFalse() throws Exception {
        StringTokenizer stringTokenizer = new StringTokenizer("Testing this application");
        stringTokenizer.nextElement();
        stringTokenizer.nextToken();

        Assert.assertFalse(stringTokenizer.hasMoreTokens());

    }

    @Test
    public void testNextElement() throws Exception {

    }

    @Test
    public void testCountTokens() throws Exception {

    }
}