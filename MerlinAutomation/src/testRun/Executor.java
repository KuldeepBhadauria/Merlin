package testRun;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import com.merlin.test.ApplicationsValidationTests;
import com.merlin.test.LogInValidationTests;


public class Executor {

	public Executor() {

	}

	public static void main(String[] args) {
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] { ApplicationsValidationTests.class });
		testng.setTestClasses(new Class[] { LogInValidationTests.class });
		testng.addListener(tla);
		testng.run();
	}

}
