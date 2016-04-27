package cfg_edge_pair_coverage;

import openjdk.StringTokenizer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

/**
 * Created by sandiferav on 4/7/2016.
 */
public class Cfg_Edge_Pair_Test {

    // [1,2,4,5,6,8]
    @Test
    public void testNextToken1() throws Exception {
        StringTokenizer stringTokenizer = new StringTokenizer("Test this string");
        Assert.assertEquals("Test this string",stringTokenizer.nextToken());
    }

    //[1,2,4,5,6,7]
    @Test(expected=NoSuchElementException.class)
    public void testNextToken4() throws Exception {
        StringTokenizer stringTokenizer = new StringTokenizer("");
        stringTokenizer.nextToken(",");
    }

    //[1,2,3,5,6,8]
    @Test
    public void testNextToken2() throws Exception {
        StringTokenizer stringTokenizer = new StringTokenizer("Test, this string");
        stringTokenizer.nextToken(",");
        Assert.assertEquals(" this string",stringTokenizer.nextToken());
    }




    @Test
    public void testNextElement() throws Exception {

    }

    @Test
    public void testCountTokensTwo() throws Exception {
        StringTokenizer stringTokenizer_countToken = new StringTokenizer("Test-token","-");
        Assert.assertEquals(stringTokenizer_countToken.countTokens(),2);
    }

    @Test
    public void testCountTokensEmpty() throws Exception {
        StringTokenizer stringTokenizer_countToken = new StringTokenizer("");
        Assert.assertEquals(stringTokenizer_countToken.countTokens(),0);
    }
}