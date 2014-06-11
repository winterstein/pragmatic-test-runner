package com.sodash.testrunner;

import static org.junit.Assert.*;

import java.io.File;
import java.util.List;

import org.junit.Test;

public class FindJavaTestsTest {

	@Test
	public void testRun() {
		File f = new File("bin");
		FindJavaTests fjt = new FindJavaTests(f);
		List<String> classes = fjt.run();		
		System.out.println(classes);
		assert ! classes.isEmpty();
		assert classes.contains(getClass().getName()) : classes;
	}

}
