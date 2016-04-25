package cfg_prime_path_coverage;

import openjdk.StringTokenizer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sandiferav on 4/7/2016.
 */
public class Cfg_Prime_Path_Coverage {

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
    public void testNextElement() throws Exception {

    }

    @Test
    public void testCountTokensEmpty() throws Exception {
        StringTokenizer stringTokenizer_countToken = new StringTokenizer("");
        Assert.assertEquals(stringTokenizer_countToken.countTokens(),0);
    }

    @Test
    public void testCountTokensTwo() throws Exception {
        StringTokenizer stringTokenizer_countToken = new StringTokenizer("Test-Token","-");
        Assert.assertEquals(stringTokenizer_countToken.countTokens(),2);
    }
}