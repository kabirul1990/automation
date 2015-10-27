package regression;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTest {
	@BeforeClass
	public void beforeClass() {
        System.out.println("Before Class");
	}
	@AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }
	@Test
	public void infoTest() {
        System.out.println("In Test");

    }

}
