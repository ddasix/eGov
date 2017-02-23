package com.sds.egov.ch02;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyVectorTest {
	private MyVector v;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		v= new MyVector();
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	public void testIsEmpty() {
		assertTrue(v.isEmpty());
		v.addElement("abc");
		assertTrue(!v.isEmpty());
		System.out.println("testIsEmpty");
	}

	@Test
	public void testContains() {
		String str1 = new String("abc");
		v.addElement(str1);
		assertTrue(v.contains(str1));	
		System.out.println("testContains");
	}

	@Test
	public void testIndexOf() {
		String str1 = new String("abc");
		String str2 = new String("def");
		v.addElement(str1);
		v.addElement(str2);	
		assertEquals(1, v.indexOf(str2));
		System.out.println("testIndexOf");
	}

	@Test
	public void testElementAt() {
		String str1 = new String("abc");
		String str2 = new String("def");
		v.addElement(str1);
		v.addElement(str2);
		assertSame(str1, v.elementAt(0));
		assertSame(str2, v.elementAt(1));
		System.out.println("testElementAt");
	}

	@Test
	public void testAddElement() {
		v.addElement("abc");
		v.addElement(new Integer(1));
		assertEquals(2, v.size());
		System.out.println("testAddElement");
	}

}
