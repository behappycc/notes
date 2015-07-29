package GradingSystem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestGeneralStudentAverage {

	private GeneralStudent generalstudent;

	@Before
	public void Setup(){
		generalstudent = new GeneralStudent("jack","r03943089",90,90,90,90,90);
	}
	@Test
	public void test() {
		double result = generalstudent.Average();
		assertEquals(90, result, 0.01);		
	}
	
	@After
	public void setDown(){
		generalstudent = null;
	}

}
