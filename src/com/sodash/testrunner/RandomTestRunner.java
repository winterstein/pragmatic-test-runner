package com.sodash.testrunner;

import java.io.File;
import java.util.Collection;
import java.util.List;

import winterwell.utils.Utils;

public class RandomTestRunner {

	private File classDir;

	public RandomTestRunner(File classDir) {
		this.classDir = classDir;
	}

	public static void main(String[] args) {
		RandomTestRunner ptr = new RandomTestRunner(new File(args[0]));
		ptr.run(1);
	}

	private void run(int n) {
		FindJavaTests ft = new FindJavaTests(classDir);
		List<String> tests = ft.run();
		
		Collection<String> chosen = Utils.getRandomSelection(n, tests);

		for(int i=0; i<n; i++) {
			// Pick a random test
			run();
		}		
	}

	private void run1() {
		
	}
}
