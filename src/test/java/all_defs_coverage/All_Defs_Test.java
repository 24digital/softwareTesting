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
    //[1,2,3]
    public void testHasMoreElementsTrue() throws Exception {
        StringTokenizer stringTokenizer = new StringTokenizer("This is a test. The weather is great!");
        Assert.assertTrue(stringTokenizer.hasMoreTokens());
    }

    @Test
    public void testCountTokens() throws Exception {
        StringTokenizer stringTokenizer_1 = new StringTokenizer("This-will-count-the-number-of-Tokens","-");
        Assert.assertEquals(stringTokenizer_1.countTokens(),7);
    }

    @Test
    public void testCountTokensEmpty() throws Exception {
        StringTokenizer stringTokenizer_countToken = new StringTokenizer("");
        Assert.assertEquals(stringTokenizer_countToken.countTokens(),0);
    }

    @Test
    public void testCountTokensSpace() throws Exception {
        StringTokenizer stringTokenizer_countToken = new StringTokenizer("   ");
        Assert.assertEquals(stringTokenizer_countToken.countTokens(),1);
    }
}