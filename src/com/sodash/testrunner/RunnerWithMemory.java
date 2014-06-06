package com.sodash.testrunner;

import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;

public class RunnerWithMemory extends Runner {

	public RunnerWithMemory(Class klass) {
		this.klass = klass;
	}
	
    @Override
	public Description getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run(RunNotifier arg0) {
		// TODO Auto-generated method stub
		
	}

}