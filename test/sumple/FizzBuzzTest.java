/**
 *
 */
package sumple;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author odeyudai
 *
 */
public class FizzBuzzTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
        System.out.println("setUpBeforeClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
        System.out.println("tearDownAfterClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
        System.out.println("setUp");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
        System.out.println("tearDown");
	}

	/**
	 * {@link sumple.FizzBuzz#main(java.lang.String[])} のためのテスト・メソッド。
	 */
	@Test
	public void testMain() {

	}

	/**
	 * {@link sumple.FizzBuzz#checkFizzBuzz(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testCheckFizzBuzz_Fizz() {
        System.out.println("Fizz");
        assertEquals("Fizz", FizzBuzz.checkFizzBuzz(9));
	}

	/**
	 * {@link sumple.FizzBuzz#checkFizzBuzz(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testCheckFizzBuzz_Buzz() {
        System.out.println("Buzz");
        assertEquals("Buzz", FizzBuzz.checkFizzBuzz(20));
	}

	/**
	 * {@link sumple.FizzBuzz#checkFizzBuzz(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testCheckFizzBuzz_FizzBuzz() {
        System.out.println("FizzBuzz");
        assertEquals("FizzBuzz", FizzBuzz.checkFizzBuzz(45));
	}

	/**
	 * {@link sumple.FizzBuzz#checkFizzBuzz(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testCheckFizzBuzz_44() {
        System.out.println("44Check");
        assertEquals("44", FizzBuzz.checkFizzBuzz(44));
	}

	/**
	 * {@link sumple.FizzBuzz#checkFizzBuzz(int)} のためのテスト・メソッド。
	 */
	@Test
	public void testCheckFizzBuzz_46() {
        System.out.println("46Check");
        assertEquals("46", FizzBuzz.checkFizzBuzz(46));
	}

}
