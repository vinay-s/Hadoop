package edu.gatech.seclass;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyStringTest {

	private MyString mystring;

	@Before
	public void setUp() throws Exception {
		mystring = new MyString();
	}

	@After
	public void tearDown() throws Exception {
		mystring = null;
	}

	@Test
	public void testGetVowels1() {
		mystring.setString("This is my string. It includes three numbers: 1 2 3");
		assertEquals("iiiIiueeeue", mystring.getVowels());
	}

	@Test
	public void testGetVowels2() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetVowels3() {
		fail("Not yet implemented");
	}

	@Test
	public void testNumberOfVowels1() {
		mystring.setString("yello");
		assertEquals(2, mystring.numberOfVowels());
	}

	@Test
	public void testNumberOfVowels2() {
		fail("Not yet implemented");
	}

	@Test
	public void testNumberOfVowels3() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCharacter1() {
		mystring.setString("This is my string. It includes three numbers: 1 2 3");
		assertTrue('n' == mystring.getCharacter(16));
	}

	@Test
	public void testGetCharacter2() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCharacter3() {
		fail("Not yet implemented");
	}

	@Test(expected = IllegalIndexException.class)
	public void testFlipCaseInSubstring1() {
		mystring.setString("abcde");
		mystring.flipCaseInSubstring(1, 10);
	}

	@Test
	public void testFlipCaseInSubstring2() {
		fail("Not yet implemented");
	}

	@Test
	public void testFlipCaseInSubstring3() {
		fail("Not yet implemented");
	}
}
