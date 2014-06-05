package com.sodash.testrunner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import winterwell.utils.ReflectionUtils;
import winterwell.utils.io.FileUtils;

/**
 * TODO find *Test files
 * @author daniel
 *
 */
public class FindJavaTests {
	
	File classDir;

	public FindJavaTests(File classDir) {
		this.classDir = classDir;
	}
	
	public List<String> run() {
		List<File> classFiles = FileUtils.find(classDir, ".*Test\\.class");
		List<String> tests = new ArrayList();
		for (File file : classFiles) {
			String klass = FileUtils.getRelativePath(file, classDir);
			tests.add(klass);
		}
		return tests;
	}
	
}
