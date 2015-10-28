package regression;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTest {
	@BeforeClass
	public void beforeClass() {
        System.out.println("Before Class added");
	}
	@AfterClass
    public void afterClass(){
        System.out.println("Hello World Again! After Class");
    }
	@Test
	public void infoTest() {
        System.out.println("Welcome to Test! Hello World.");

    }

}
