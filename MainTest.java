import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MainTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MainTest
{
    /**
     * Default constructor for test class MainTest
     */
    public MainTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void summarizer6(){
        // : Given
        int input = 6;
        int expected = 21;
        // : When
        int actual = Main.summarizer(input);
        // : Then
        assertEquals(expected, actual);
    }
       
    @Test
    public void summarizer100(){
        // : Given
        int input = 100;
        int expected = (input*(input+1))/2;
        // : When
        int actual = Main.summarizer(input);
        // : Then
        assertEquals(expected, actual);
    }
    
    @Test
    public void summarizer1000(){
        // : Given
        int input = 1000;
        int expected = (input*(input+1))/2;
        // : When
        int actual = Main.summarizer(input);
        // : Then
        assertEquals(expected, actual);
    }
}
