package all_defs_coverage;

import openjdk.StringTokenizer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

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
// []
    @Test
    public void testNextTokenReturnToken() throws Exception {
        StringTokenizer stringTokenizer = new StringTokenizer("Test this string");
        Assert.assertEquals("Test",stringTokenizer.nextToken());
    }

    @Test
    public void testNextTokenSeparate() throws Exception {
        StringTokenizer stringTokenizer = new StringTokenizer("Test, split string");
        stringTokenizer.nextToken(",");
        Assert.assertEquals(" split string",stringTokenizer.nextToken());
    }

    @Test(expected=NoSuchElementException.class)
    public void testNextTokenExcept() throws Exception {
        StringTokenizer stringTokenizer = new StringTokenizer("");
         stringTokenizer.nextToken();
    }

    @Test(expected=NoSuchElementException.class)
    public void testNextToken2() throws Exception {
        StringTokenizer stringTokenizer = new StringTokenizer("");
        stringTokenizer.nextToken(",");
    }

    /**
     * Testing for more elements to exist after construction.
     * @throws Exception
     */
    @Test
    public void testHasMoreElementsTrue() throws Exception {
        StringTokenizer stringTokenizer = new StringTokenizer("This is a test. The weather is great!");
        Assert.assertTrue(stringTokenizer.hasMoreTokens());

    }

    @Test
    public void testNextElement() throws Exception {

    }

    @Test
    public void testCountTokens() throws Exception {

    }
}