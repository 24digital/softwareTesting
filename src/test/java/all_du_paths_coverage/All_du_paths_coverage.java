package all_du_paths_coverage;

import openjdk.StringTokenizer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sandiferav on 4/7/2016.
 */
public class All_du_paths_coverage {

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
       int k = stringTokenizer.countTokens();
        Assert.assertTrue(stringTokenizer.hasMoreTokens());

    }


    @Test
    public void testNextElement() throws Exception {

    }

    @Test
    public void testCountTokens() throws Exception {

    }
}