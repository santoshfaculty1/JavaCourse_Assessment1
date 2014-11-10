package BinarySearch;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


/**
 * Unit tests for the exercise
 */
public class BinarySearchTest extends TestCase {
	    /**
	     * Create the test case
	     *
	     * @param testName name of the test case
	     */
		BinarySearch bs = null;
	    public BinarySearchTest( String testName )
	    {
	        super( testName );
	        bs = new BinarySearch();
	    }

	    /** 
	     * @return the suite of tests being tested
	     */
	    public static Test suite()
	    {
	        return new TestSuite( BinarySearchTest.class );
	    }
	    
	    /*@Before
	    public void setUp() {
	         bs = new BinarySearch();
	    }*/
	    

	    /**
	     * Simple Test :-)
	     */
	    public void testExerciseNumNotFound()
	    {
	        int expectedResult = -1;
	        bs.setInputArray(20);
	        int actualResult = bs.binarySearch(22);
	        
	        assertEquals(expectedResult, actualResult);
	    }

	    public void testExerciseNumberFound()
	    {
	    	int expectedResult = 33;
	        bs.setInputArray(100);
	        int actualResult = bs.binarySearch(32);
	        
	        assertEquals(expectedResult, actualResult);
	    }
	}
