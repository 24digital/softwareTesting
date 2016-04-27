package branch_coverage;

import openjdk.StringTokenizer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

/**
 * Created by sandiferav on 4/7/2016.
 */
public class Branch_Coverage_Test {

    /**
     * Testing second branch in nextToken() method
     * when when currentPosition >=maxPosition returns false and also
     * it tests first branch when newPosition >=0 is false
     * and !delimsChanged is true
     * 2th and 6th test cases
     * @throws Exception
     */
    @Test
    public void testNextToken1() throws Exception {
        StringTokenizer stringTokenizer = new StringTokenizer("Test this string");
        Assert.assertEquals("Test this string",stringTokenizer.nextToken());
    }

    /**
     * Testing second branch in nextToken() method
     * when when currentPosition >=maxPosition returns true
     * and first branch when newPosition >=0 is false
     * and !delimsChanged is false
     * 4th and 5th test cases
     * @throws Exception
     */
    @Test(expected=NoSuchElementException.class)
    public void testNextToken4() throws Exception {
        StringTokenizer stringTokenizer = new StringTokenizer("");
        stringTokenizer.nextToken(",");
    }
    /**
     * Testing first branch when newPosition >= 0 is true
     * and and !delimsChanged is false
     * 1st test case
     * @throws Exception
     */
    @Test
    public void testNextToken5() throws Exception {
        StringTokenizer stringTokenizer = new StringTokenizer("Test this string"," ");
        stringTokenizer.nextElement();
        Assert.assertEquals("this",stringTokenizer.nextToken());
    }

    /**
     * Testing first branch when newPosition >= 0 is true
     * and and !delimsChanged is true
     * 3d test case
     * @throws Exception
     */
    public void testNextToken6() throws Exception {
        StringTokenizer stringTokenizer = new StringTokenizer("Test this string");
        stringTokenizer.nextElement();
        Assert.assertEquals("this",stringTokenizer.nextToken());
    }



}