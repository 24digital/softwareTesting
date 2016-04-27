package all_du_paths_coverage;

import openjdk.StringTokenizer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

/**
 * Created by sandiferav on 4/7/2016.
 */
public class All_du_paths_coverage {

    @Before
    public void setUp() throws Exception {

    }
    // [1,2,4,5,6,8]
    @Test
    public void testNextToken1() throws Exception {
        StringTokenizer stringTokenizer = new StringTokenizer("Test this string");
        Assert.assertEquals("Test",stringTokenizer.nextToken());
    }
    //[1,2,3,5,6,8]
    @Test
    public void testNextToken2() throws Exception {
        StringTokenizer stringTokenizer = new StringTokenizer("Test, split string");
        stringTokenizer.nextToken(",");
        Assert.assertEquals(" split string",stringTokenizer.nextToken());
    }
    //[1,2,3,5,6,7]
    @Test(expected=NoSuchElementException.class)
    public void testNextToken3() throws Exception {
        StringTokenizer stringTokenizer = new StringTokenizer("");
        stringTokenizer.nextToken();
    }
    //[1,2,4,5,6,7]
    @Test(expected=NoSuchElementException.class)
    public void testNextToken4() throws Exception {
        StringTokenizer stringTokenizer = new StringTokenizer("");
        stringTokenizer.nextToken(",");
    }

    @Test
    public void testHasMoreTokens() throws Exception {

    }

    /**
     * Testing for more elements to exist after construction.
     * @throws Exception
     */
    @Test
    public void testHasMoreElementsTrue() throws Exception {
        StringTokenizer stringTokenizer = new StringTokenizer("Test 1");
       int k = stringTokenizer.countTokens();
        Assert.assertTrue(stringTokenizer.hasMoreTokens());

    }

    @Test
    public void testCountTokensSingle() throws Exception {
        StringTokenizer stringTokenizer_countToken = new StringTokenizer("Test");
        Assert.assertEquals(stringTokenizer_countToken.countTokens(),1);
    }

    @Test
    public void testCountTokensEmpty() throws Exception {
        StringTokenizer stringTokenizer_countToken = new StringTokenizer("");
        Assert.assertEquals(stringTokenizer_countToken.countTokens(),0);
    }
}