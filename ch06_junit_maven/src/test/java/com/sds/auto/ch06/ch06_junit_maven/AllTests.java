package com.sds.auto.ch06.ch06_junit_maven;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses( { 
	MyVectorTest.class, 
	MyStackTest.class 
})

public class AllTests { }
