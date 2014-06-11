package com.sodash.testrunner;

import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;

/**
 * A JUnit4 runner which handles saving it's output.
 * @author daniel
 *
 */
public class RunnerWithMemory extends Runner {

	private Class klass;

	public RunnerWithMemory(Class klass) {
		this.klass = klass;
	}
	
    @Override
	public Description getDescription() {
		return Description.createSuiteDescription(klass);
	}

	@Override
	public void run(RunNotifier rn) {
		// before
		
		// after
		
		// get tests
	}

}