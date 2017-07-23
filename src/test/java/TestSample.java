import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSample {
	
	static {
		System.out.println("スタティックイニシャライザ call");
	}

	{
		System.out.println("インスタンスイニシャライザ call");
	}
	
	public TestSample() {
		System.out.println("コンストラクタ call");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize call");
		try {
			super.finalize();
		}catch(Exception e) {
		}
	};
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass call");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass call");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("@Before	Class call");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("@After call");
	}

	@Test
	public void testSample1() {
		System.out.println("@Test testSample1 call");
		Person person = new Person(2, 6, "太郎");
		int min = 100;
		assertEquals(2 * min, person.walk(min));
	}
	
//	@Test
	//	public void testSample2() {
	//	System.out.println("@Test testSample2 call");
	//	Person person = new Person(2, 6, "太郎");
	//	int min = 100;
	//	assertEquals(5 * min, person.walk(min));
	//	}
	
	
}
