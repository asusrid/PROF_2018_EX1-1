package asusrid.examen;

import org.junit.Test;

import junit.framework.TestCase;

public class MyStringTest extends TestCase {

	@Test
	public void testS1equalsS2() {
		MyString p1 = new MyString("iguales");
		MyString p2 = new MyString("iguales");
		assertTrue(p1.compareTo(p2) == 0);
	}
	
	@Test
	public void testS1greaterS2() {
		MyString p1 = new MyString("Noiguales");
		MyString p2 = new MyString("iguales");
		System.out.println(p1.compareTo(p2));
		assertTrue(p1.compareTo(p2) < 0);
	}
	
	@Test
	public void testS1smallerS2() {
		MyString p1 = new MyString("iguales");
		MyString p2 = new MyString("Noiguales");
		System.out.println(p1.compareTo(p2));
		assertTrue(p1.compareTo(p2) > 0);
	}
	
}
