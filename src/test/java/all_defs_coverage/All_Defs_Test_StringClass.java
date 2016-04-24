package all_defs_coverage;
import static org.junit.Assert.*;
import org.junit.Test;

public class All_Defs_Test_StringClass {
    /////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////charAt tests//////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////
    // [1,2,4,5]
    @Test
    public void testPosCharAt() throws Exception {
        String strT1 = "Hello";
        Character charT1 = 'e';
        int compare1 = charT1.compareTo(strT1.charAt(1));
        assertEquals(0, compare1);

    }
    // [1,2,4,3]
    @Test(expected=StringIndexOutOfBoundsException.class)
    public void testLengthCharAt1() throws Exception {
        String strT1 = "Hello";
        strT1.charAt(5);
        //catch error

    }
    // [1,2,4,3]
    @Test(expected=StringIndexOutOfBoundsException.class)
    public void testGreaterCharAt() throws Exception {
        String strT1 = "Hello";
        strT1.charAt(10);
        //catch error

    }
    // [1,2,3]
    @Test(expected=StringIndexOutOfBoundsException.class)
    public void testNegCharAt() throws Exception {
        String strT1 = "Hello";
        //catch error
        strT1.charAt(-1);

    }
/////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////substring tests//////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////

    //[1,2,3]
    @Test(expected=StringIndexOutOfBoundsException.class)
    public void testNegSubstring() throws Exception {
        String strT1 = "This is my computer";
        //catch error
        strT1.substring(-1);

    }
    //[1,2,4,6,8]
    @Test
    public void testPosSubstring() throws Exception {
        String strT1 = "This is my computer";
        String subT1 = strT1.substring(8);
        assertTrue(subT1.equals("my computer"));

    }
    //[1,2,4,5]
    @Test(expected=StringIndexOutOfBoundsException.class)
    public void testGreaterSubstring() throws Exception {
        String strT1 = "This is my computer";
        String subT1 = strT1.substring(50);
        //catch error

    }
    //[1,2,4,6,7]
    @Test
    public void testFirstSubstring() throws Exception {
        String strT1 = "This";
        String subT1 = strT1.substring(0);
        //return this [aka whole string]
    }

    /**This test proves there is a bug in substring on line 1916.
     * Expected: Method should throw an StingOutOfBoundsException since there is no index of 4.
     * Actual: returns an empty string and no exception
     */
    @Test
    public void testLengthBugSubstring() throws Exception {
        String strT1 = "This";
        System.out.println(strT1.length());
        //index = length should throw error
        String subT1 = strT1.substring(4);
        System.out.println(subT1);

    }

}
