package com.sodash.testrunner;

import java.io.File;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.notification.RunNotifier;

import winterwell.utils.Utils;
import winterwell.utils.io.FileUtils;
import winterwell.utils.reporting.Log;

public class RandomTestRunner {

	private File classDir;

	public RandomTestRunner(File classDir) {
		this.classDir = classDir;
	}

	public static void main(String[] args) {
		File f = args.length==0? new File(FileUtils.getWorkingDirectory(),"bin") : new File(args[0]);
		RandomTestRunner ptr = new RandomTestRunner(f);
		ptr.run(1);
	}

	private void run(int n) {
		FindJavaTests ft = new FindJavaTests(classDir);
		List<String> tests = ft.run();
		
		Collection<String> chosen = Utils.getRandomSelection(n, tests);

		for (String klass : chosen) {
			try {
				run1(klass);
			} catch(Throwable ex) {
				Log.e(klass, ex);
			}
		}
	}

	void run1(String klass) throws Exception {
		Class<?> clazz = Class.forName(klass);
		if ( ! clazz.isAnnotationPresent(Test.class)) {
			return;
		}		
		RunnerWithMemory runner = new RunnerWithMemory(clazz);
		runner.run(null);
	}
	
}
